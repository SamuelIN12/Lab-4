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
