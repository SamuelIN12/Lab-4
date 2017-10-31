/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samueliregbu
 */
public class Customer {
    
    private String name;
    private String address;
    private float creditRating;
    private float discountRating;
    
    public Customer(String Name1, String Address1, float Credit_Rating1, float Discount_Rating1)
    {
        this.name = Name1;
        this.address = Address1;
        this.creditRating = Credit_Rating1;
        this.discountRating = Discount_Rating1;
    }
    
    public float getCreditRating()
    {
        return creditRating;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public float getDiscountRating()
    {
        return discountRating;
    }
    
    
