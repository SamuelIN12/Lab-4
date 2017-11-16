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
    
    public Customer()
    {
        name = "";
        address = "";
        creditRating = 0.00f;
        discountRating = 0.00f;
    }
    
    public Customer(String Name1, String Address1, float Credit_Rating1, float Discount_Rating1)
    {
        name = Name1;
        address = Address1;
        creditRating = Credit_Rating1;
        discountRating = Discount_Rating1;
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
    
    public void setName(String name1)
    {
        name = name1;
    }
    
    public void setAddress(String address1)
    {
        address = address1;
    }
    
    public void setCreditRating(float creditRating1)
    {
        creditRating = creditRating1;
    }
    
    public void setDiscountRating(float discountRating1)
    {
        discountRating = discountRating1;
    }
}



