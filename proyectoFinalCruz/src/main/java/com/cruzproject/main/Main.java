

package com.cruzproject.main;

import com.cruzproject.entities.Client;
import com.cruzproject.entities.Product;
public class Main {
    public static void main(String[] args){
        Product cantimplora = new Product(1, "cantimplora", 600.00, 10);
        Client fernando = new Client(1, "Fernando", "Cruz", 38623621);

        System.out.println("El producto " + cantimplora.getName()
                + " ha sido comprado por el cliente " + fernando.getName());

    }


}
