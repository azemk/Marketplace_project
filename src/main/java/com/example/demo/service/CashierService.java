package com.example.demo.service;

import com.example.demo.model.Cashier;

import java.util.List;

public interface CashierService {
    Cashier create (Cashier cashier);
    Cashier update (Cashier cashier);


    List<Cashier> getByItem(String category);

    List<Cashier> getAll();

    void delete (Integer id );
}
