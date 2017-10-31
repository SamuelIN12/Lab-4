/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author samueliregbu
 */
public class ProductCatalogue implements Iterable<Product>
{
    private ArrayList<Product> Products;
    
    public ProductCatalogue()
    {
        Products = new ArrayList<Product>();
    }
    
    public void addProduct(String Name1, Double Price1, int Product_ID1)
    {
        
        Product product = new Product(Name1, Price1, Product_ID1);
        Products.add(product);
    }
    
    @Override
    public Iterator<Product> iterator()
    {
        return Products.iterator();
    }
}
