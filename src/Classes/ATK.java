package Classes;

import java.util.Date;

import Classes.Abstract.Product;

public class ATK extends Product{

    public ATK(String name, double price, Date expiryDate, String idBarang, int stock) {
        super(name, price, expiryDate, idBarang, stock);
    }
    
}
