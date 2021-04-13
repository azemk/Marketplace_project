package com.example.demo.service;

import com.example.demo.model.Cashier;
import com.example.demo.repository.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CashierServiceImpl implements CashierService{
    @Autowired
    CashierRepository cashierRepository;
    @Override
    public Cashier create(Cashier cashier) {
        return cashierRepository.save(cashier);
    }

    @Override
    public Cashier update(Cashier cashier) {
        return cashierRepository.save(cashier);
    }

//    @Override
//    public List<Cashier> getByItem(String category) {
//        return cashierRepository.findAll().stream().filter(x ->{
//            return x.getProduct().getCategory().equals(category);
//        }).collect(Collectors.toList());
//    }toList

    @Override
    public List<Cashier> getByItem(String category) {
        return null;
    }

    @Override
    public List<Cashier> getAll() {
        return cashierRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
cashierRepository.deleteById(id);

    }
}
