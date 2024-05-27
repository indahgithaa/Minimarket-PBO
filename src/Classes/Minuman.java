package Classes;

import java.util.Date;

import Classes.Abstract.Product;
import Classes.Enum.Size;

public class Minuman extends Product {
    protected Size size;

    public Minuman(String name, double price, Date expiryDate, String idBarang, Size size) {
        super(name, price, expiryDate, idBarang);
        this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
    
