/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samueliregbu
 */
public class CorporateCustomer extends Customer
{
    public CorporateCustomer(String Name1, String Address1, float Credit_Rating1, float Discount_Rating1) {
        super(Name1, Address1, Credit_Rating1, Discount_Rating1);
        
    }
    
    private String contactName;
}
