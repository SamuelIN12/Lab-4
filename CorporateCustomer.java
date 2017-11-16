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
    private String contactName;

    public CorporateCustomer(String Name1, String Address1, float Credit_Rating1, float Discount_Rating1, String contact_Name)
    {
        super(Name1, Address1, Credit_Rating1, Discount_Rating1);
         contactName = contact_Name;
    }
    
    private String getcontactName()
    {
        return contactName;
    }
}
