/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author samueliregbu
 */
public class OrderApplication {
    
    public ProductCatalogue Catalogue;
    
    public static void main(String[] args){
        
        Customer customer = new Customer("Samuel Kurtis", "23 Rose Street", 2222.25f, 340.50f);
        double price = 0.00;
        
        Order order = new Order(customer);
        OrderApplication orderApp = new OrderApplication();
        
        if (orderApp.createOrder(order))
        {
            price = order.calculatePrice();
            System.out.printf("The Order price is $%.2f\n", price);
        }
        
        
        order.printOrder();
        
        Scanner read = new Scanner(System.in);
        char input = '0';
        
        do {
            input = read.next().charAt(0);
        } while ((input != '0' && input != '1'));
        
        if (input == '1') {
            System.out.printf("Enter the orderline ID to be removed: ");
            String index = read.next();
            
            if (order.removeOrderItem(Integer.parseInt(index) - 1) != null) {
                System.out.printf("Removed");
            }
            else
            {
                System.out.print("unable to remove item. \n");
            }
        }
        
        else if (input != '0')
        {
            System.out.printf("Enter the orderline ID to be modified:" );
            int index = Integer.parseInt(read.next());
            
            if (index <= order.OrderCount() && index != 0)
            {
                System.out.printf("Enter new quantity: ");
                int quantity = Integer.parseInt(read.next());
                
                order.setQuantity(index - 1,  quantity);
            }
        }
        
    }
    
    
    public OrderApplication()
    {
    }
    
    public boolean createOrder(Order oRef) {
        
        boolean complete = this.importCatalogue();
        
        if (complete) {
            Iterator<Product> iterator = Catalogue.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                oRef.addOrderItem(product, 1);
            }
        }
        
        return complete;
    }
    
    public boolean importCatalogue() {
        boolean complete = true;
        Catalogue = new ProductCatalogue();
        Scanner in = null;
        
        try {
            in = new Scanner(Paths.get("products.csv"));
            while (in.hasNextLine()) {
                String[] ProductData = in.nextLine().split(",");
                Catalogue.addProduct(ProductData[0],Double.parseDouble(ProductData[1]),
                                     Integer.parseInt(ProductData[2]));
            }
            
            in.close();
            
        } catch (Exception IOException) {
            {
                System.out.printf("cannot be read!!!! \n");
                
            }
            
            while(in != null)
            {
                in.close();
            }
            
            
            complete = false;
            
            
        }
        
        return complete;
    }
}

	}
