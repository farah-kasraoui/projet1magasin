package tn.esprit.projet1magasin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet1magasin.entities.CategorieProduit;
import tn.esprit.projet1magasin.services.IServiceCategorieProduit;

import java.util.List;
@RestController
@RequestMapping("/categorieproduit")
public class ControllerCategorieProduit {
    @Autowired
    IServiceCategorieProduit categorieProduit;


   @GetMapping ("get")
    public List<CategorieProduit> retrieveAllCategorieProduits(){
        return categorieProduit.retrieveAllCategorieProduits();

    }
@PostMapping("/ajout")
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp){
        return categorieProduit.addCategorieProduit(cp);
    }
@PutMapping("/update")
    public CategorieProduit updateCategorieProduit( @RequestBody CategorieProduit cp){
        return categorieProduit.updateCategorieProduit(cp);
    }
@GetMapping("/get/{id}")
    public CategorieProduit retrieveCategorieProduit( @PathVariable Long id){
       return categorieProduit.retrieveCategorieProduit(id);
    }
}
