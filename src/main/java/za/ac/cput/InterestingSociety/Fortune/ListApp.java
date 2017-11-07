/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Fortune;

/**
 *
 * @author Four Chan
 */

import java.util.*;

public class ListApp {
    
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();
        
        p1.setProductCode(123);
        p1.setProductName("Vacuum Cleaner");
        p1.setProdcutDescription("C16 Model");
        p1.setManufacturer("DustCo. Industries");
        p1.setProductPrice(99.99);
        
        p2.setProductCode(234);
        p2.setProductName("Hammer");
        p2.setProdcutDescription("Std. Ball-Peen Hammer");
        p2.setManufacturer("H & N");
        p2.setProductPrice(29.99);
        
        p3.setProductCode(345);
        p3.setProductName("Haunter");
        p3.setProdcutDescription("PC Video Game, Release: 2017");
        p3.setManufacturer("SegFault");
        p3.setProductPrice(10.00);
        
        p4.setProductCode(456);
        p4.setProductName("Lawnmower");
        p4.setProdcutDescription("Vault Tech Easy Mow");
        p4.setManufacturer("Vault Tech");
        p4.setProductPrice(199.99);
        
        p5.setProductCode(456);
        p5.setProductName("LawnMowerDeluxe");
        p5.setProdcutDescription("Vault Tech Easy Mow Delux Edition");
        p5.setManufacturer("Vault Tech");
        p5.setProductPrice(299.99);
        
        List alProducts = new ArrayList<Product>();
        alProducts.add(p1);
        alProducts.add(p2);
        alProducts.add(p3);
        alProducts.add(p4);
        alProducts.add(p5);
        
        System.out.println("ArrayList: " + alProducts.toString() + "\n Size: " + alProducts.size());
        
        Set hProducts = new HashSet<Product>();
        hProducts.add(p1);
        hProducts.add(p2);
        hProducts.add(p3);
        hProducts.add(p4);
        hProducts.add(p5);
        
        System.out.println("HashSet: " + hProducts.toString() + "\n Size: " + hProducts.size());
        
        DoublyLinkedList dlProduct = new DoublyLinkedList();
        dlProduct.insertBefore(p1);
        dlProduct.insertAfter(p2);
        dlProduct.insertNth(p3, 1);
        dlProduct.addAscending(p4);
        dlProduct.insertAfter(p5);
        
        System.out.println("\nDoublyLinkedList\n\nForward:");
        dlProduct.printForward();
        System.out.println("\nBackward");
        dlProduct.printBackward();
       
    }
    
}
