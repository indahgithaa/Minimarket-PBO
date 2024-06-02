package Classes;

import java.util.Date;

import Classes.Abstract.Product;
import Classes.Enum.Size;

public class Minuman extends Product {
    protected Size size;

    public Minuman(String name, double price, Date expiryDate, String idBarang, int stock) {
        super(name, price, expiryDate, idBarang, stock);
    }    

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
    
