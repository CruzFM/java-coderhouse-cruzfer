package com.cruzproject.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {

    //characteristics
    private int id;
    private String name;
    private String lastname;
    private String dni;

    //Constructor
    public Client (int id, String name, String lastname, String dni){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
    }

    private List<Product> products;

    //Getters and setters

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public void addProduct(Product product) {
        if(product == null){
            products = new ArrayList<>();
        }
        products.add(product);
    }
    public void removeProduct(Product product){
        if(products != null){
            products.remove(product);
        }
        products.remove(products);
    }

    public List<Product> getProducts(){
        return products;
    }
}
