package phone.comparephone;


import org.springframework.stereotype.Service;
import phone.iphone.Iphone;

/**
 *
 * @author Admin
 */
//@Service
public class CompareCartItem {
    
Iphone iphone;
short quantity;


public CompareCartItem(Iphone iphone) {
this.iphone =  iphone;
quantity = 1;
}

public Iphone  getProduct() {
return  iphone;
}


public short getQuantity() {
return quantity;
}


public void setQuantity(short quantity) {
this.quantity = quantity;
}


public void incrementQuantity() {
quantity++;
}


public void decrementQuantity() {
quantity--;
}


public double getTotal() {
double amount = 0;
//amount = (this.getQuantity() *  hmc.getCost().doubleValue());
amount = (this.getQuantity() *  iphone.getPrice());
return amount;
}  

    @Override
    public String toString() {
        return "CompareCartItem{" + "iphone=" + iphone + ", quantity=" + quantity + '}';
    }



}
