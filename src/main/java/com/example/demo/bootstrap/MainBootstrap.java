package com.example.demo.bootstrap;

import com.example.demo.model.Cashier;
import com.example.demo.model.Item;
import com.example.demo.repository.CashierRepository;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    CashierRepository cashierRepository;
    @Autowired
    ItemRepository itemRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
     try{
         Cashier c = cashierRepository.findById(50).get();


         Item item1 = new Item("cheese",200, LocalDateTime.of(2001,12,13,12,1),"milky-products",c);
         Item item2 = new Item("bread",25,LocalDateTime.of(2021,1,25,15,7),"flourish-products",c);
         Item item3 = new Item("coke",35,LocalDateTime.of(2020,1,25,15,7),"drinks",c);
         Item item4 = new Item("water",18,LocalDateTime.of(2022,1,25,15,7),"drinks",c);
         itemRepository.save(item1);
         itemRepository.save(item2);
         itemRepository.save(item3);
         itemRepository.save(item4);


     }catch(DataIntegrityViolationException exception){
         System.out.println(exception.getMessage());

        }finally{
         System.out.println("Marketplace is working !");

        }
    }
}
