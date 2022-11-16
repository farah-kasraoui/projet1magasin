package tn.esprit.projet1magasin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1magasin.entities.Stock;
import tn.esprit.projet1magasin.services.IServiceStock;

import java.util.List;

@RestController
@RequestMapping
public class ControllerStock {
    @Autowired
    IServiceStock  iServiceStock;

@GetMapping("/Get")
    public List<Stock> retrieveAllStocks() {
        return iServiceStock.retrieveAllStocks();
    }

    @PostMapping("/post")
    public Stock addStock(@RequestBody Stock s){
        return iServiceStock.addStock(s);
    }

@PutMapping("update")
    public Stock updateStock(@RequestBody Stock s){
        return iServiceStock.updateStock(s);
    }
@GetMapping("get/{id}")
    public Stock retrieveStock(@PathVariable Long id){
        return iServiceStock.retrieveStock(id);
    }


    @DeleteMapping("/delete/{id}")
    public void removeStock(@PathVariable Long id){
        iServiceStock.removeStock(id);
    }
}
