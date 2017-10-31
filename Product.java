/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samueliregbu
 */
public class Product {
    private String name;
    private Double price;
    private int productID;
    
    public Product(String Name1, Double Price1, int Product_ID1)
    {
        this.name = Name1;
        this.price = Price1;
        this.productID = Product_ID1;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Double getPrice()
    {
        return price;
    }
    
    public int getProductID()
    {
        return productID;
    }
}
