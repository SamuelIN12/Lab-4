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
    
    public OrderLine(Product Product2, int Quantity2, Double Price2)
    {
        this.Quantity1 = Quantity2;
        this.Price1 = Price2;
        this.Product1 = Product2;
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
}
