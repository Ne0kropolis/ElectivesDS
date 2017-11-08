/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Emile;

/**
 *
 * @author Four Chan
 */

import java.util.*;

public class ListApp {
    
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();
        People p4 = new People();
        People p5 = new People();
        
        p1.setName("Zubenathi");
        p1.setIdentificationNumber(9503011309089);

        p1.setName("Emile");
        p1.setIdentificationNumber(9512145178088);

        p1.setName("Russel");
        p1.setIdentificationNumber(9610195009086);

        p1.setName("Thomas");
        p1.setIdentificationNumber(9604265364083);

        p1.setName("Kuhle");
        p1.setIdentificationNumber(9602270503088);
        
        List alProducts = new ArrayList<Product>();
        alPeople.add(p1);
        alPeople.add(p2);
        alPeople.add(p3);
        alPeople.add(p4);
        alPeople.add(p5);
        
        System.out.println("ArrayList: " + alPeople.toString() + "\n Size: " + alPeople.size());
        
        Set hPeople = new HashSet<People>();
        hPeople.add(p1);
        hPeople.add(p2);
        hPeople.add(p3);
        hPeople.add(p4);
        hPeople.add(p5);
        
        System.out.println("HashSet: " + hPeople.toString() + "\n Size: " + hPeople.size());
        
        DoublyLinkedList dlPeople = new DoublyLinkedList();
        dlPeople.insertBefore(p1);
        dlPeople.insertAfter(p2);
        dlPeople.insertNth(p3, 1);
        dlPeople.addAscending(p4);
        dlPeople.insertAfter(p5);
        
        System.out.println("\nDoublyLinkedList\n\nForward:");
        dlPeople.printForward();
        System.out.println("\nBackward");
        dlPeople.printBackward();
       
    }
    
}
