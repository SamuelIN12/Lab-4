/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samueliregbu
 */
public class OrderLine {
    
    private int Quantity1;
    private Double Price1;
    private Product Product1;
    
    public OrderLine()
    {
        Product product = new Product();
        Quantity1 = 0;
        Price1 = 0.00;
    }
    
    public OrderLine(Product Product2, int Quantity2, Double Price2)
    {
        Quantity1 = Quantity2;
        Price1 = Price2;
        Product1 = Product2;
    }
    
    public Product getProduct()
    {
        return Product1;
    }
    
    public int getQuantity()
    {
        return Quantity1;
    }
    
    public Double getPrice()
    {
        return Price1;
    }
    public void setPrice(Double price_2)
    {
        Price1 = price_2;
    }
    
    public void setQuantity(int quantity_2)
    {
        Quantity1 = quantity_2;
    }
}
