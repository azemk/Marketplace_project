package com.example.demo.controller;

import com.example.demo.model.Cashier;
import com.example.demo.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.tokens.ScalarToken;

import java.util.List;

@RestController
@RequestMapping("cashier")
public class CashierController {
    @Autowired
    CashierService cashierService;
    @GetMapping("/getCashier")
    public List<Cashier> getAll(){
        return cashierService.getAll();
    }
    @PostMapping("/create")
    public Cashier create(@RequestBody Cashier cashier){
        return cashierService.create(cashier);
    }
    @PostMapping("/update")
    public Cashier update(@RequestBody Cashier cashier ){
        return  cashierService.update(cashier);
    }
    @GetMapping("/getByCategory/category")
    public List<Cashier> getByItem(@PathVariable String category){
        return cashierService.getByItem(category);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id ){
        cashierService.delete(id);
        return "Successfully deleted !";
    }


}
