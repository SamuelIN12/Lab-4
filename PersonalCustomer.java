/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samueliregbu
 */
public class PersonalCustomer extends Customer
{
    private int creditCardNumber;
    
    public PersonalCustomer(String Name1, String Address1, float Credit_Rating, float Discount_Rating, int creditCard_Number)
    {
        super(Name1, Address1, Credit_Rating, Discount_Rating);
        creditCardNumber = creditCard_Number;
    }
    
    
    public int getCreditCardNumber()
    {
        return creditCardNumber;
    }
}
