package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //logging
        //Authentication & Authorization
        //Sanitize the Date
        System.out.println("checkout Method from ShoppingCart Called");
    }

    public int quantity(){
        return 2;
    }
}
