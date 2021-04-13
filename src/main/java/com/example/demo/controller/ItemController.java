package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/getItems")
    public List<Item> getItems(){
        return itemService.getAll();
    }
    @PostMapping("/create")
    public Item create(@RequestBody Item item ){
        return itemService.create(item);
    }
    @GetMapping("/getByCategory/{category}")
        public List<Item> getByCategory(@PathVariable String category){
            return itemService.getByCategory(category);
        }

    @GetMapping("/getNewest")
    public List<Item> getNewest(){
        return itemService.getNewest();
    }
    @GetMapping("/getAll")
    public List<Item > getAll(){
        return itemService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id ){
        itemService.delete(id);
        return "succesfully deleted!";

    }

}
