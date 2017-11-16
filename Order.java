/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author samueliregbu
 */
public class Order {
    
    private Date dateReceived;
    private Double price;
    private int orderID;
    private Customer customer;
    public ProductCatalogue catalogue;

    public ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();

    public Order(Customer Customer1)
    {
        price = 0.00;
        orderID = 1;
        dateReceived = new Date();
        customer = Customer1;
    }
    
    public Date getDateReceived()
    {
        return dateReceived;
    }
    
    public Double calculatePrice()
    {
        Iterator<OrderLine> iterator = orderLine.iterator();
        
        while (iterator.hasNext()) {
            OrderLine PresentOrder = iterator.next();
            Product Product1 = PresentOrder.getProduct();
            double Product_Price = Product1.getPrice();
            double Product_Quantity = PresentOrder.getQuantity();
            double Base_Price = Product_Price * Product_Quantity;
            Base_Price = Base_Price - (Base_Price * customer.getDiscountRating());
            
            this.price += Base_Price;
        }
        
        return price;
    }
    
    public void addOrderItem(Product product, int quantity)
    {
        OrderLine newOrder = new OrderLine(product, 1, product.getPrice()); 
        orderLine.add(newOrder);
    }
    
    
    public void setQuantity(int index, int quantity)
    {
        OrderLine order = orderLine.get(index);
        
        while (order != null)
        {
            order.setQuantity(quantity);
            order.setPrice(quantity * order.getProduct().getPrice());
        }
        
    }
    
    public void printOrder()
    {
        Iterator<OrderLine> iterator = orderLine.iterator();
        int i = 0;
        
        while (iterator.hasNext()) {
            OrderLine curOrder = iterator.next();
            Product product = curOrder.getProduct();
            System.out.printf("Orderline ID #: %d | Name of Product: %s | Price of product: $%.2f | Quantity: %d | Total: $%.2f\n", i+1, product.getName(), product.getPrice(), curOrder.getQuantity(), curOrder.getPrice());
            ++i;
        }
    }
    
    public int OrderCount()
    {
        return orderLine.size();
    }
    public OrderLine removeOrderItem(int i)
    {
        return orderLine.remove(i);
    }
    
    public double getPrice()
    {
        return price;
    }
}
