package tn.esprit.projet1magasin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet1magasin.entities.Stock;
import tn.esprit.projet1magasin.repositories.RepositoryStock;

import java.util.List;

@Service
public class ServiceStock implements IServiceStock {
    @Autowired
    RepositoryStock  repositoryStock;
    @Override
    public List<Stock> retrieveAllStocks() {
        return repositoryStock.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return repositoryStock.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return repositoryStock.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return repositoryStock.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        repositoryStock.deleteById(id);

    }
}
