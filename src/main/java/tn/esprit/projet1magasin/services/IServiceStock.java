package tn.esprit.projet1magasin.services;

import tn.esprit.projet1magasin.entities.Stock;

import java.util.List;

public interface IServiceStock {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
