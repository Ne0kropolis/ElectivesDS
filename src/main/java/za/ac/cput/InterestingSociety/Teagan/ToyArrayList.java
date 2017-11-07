/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Teagan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToyArrayList {

    public static void main(String[] args) {

        Toys t1 = new Toys();
        t1.setId(001);
        t1.setType("Teddy Bear");
        t1.setPrice(50.00);

        Toys t2 = new Toys();
        t2.setId(002);
        t2.setType("Race Car");
        t2.setPrice(09.99);

        Toys t3 = new Toys();
        t3.setId(003);
        t3.setType("Action Figure");
        t3.setPrice(25.99);

        Toys t4 = new Toys();
        t4.setId(004);
        t4.setType("Doll");
        t4.setPrice(34.99);

        Toys t5 = new Toys();
        t5.setId(005);
        t5.setType("Lego");
        t5.setPrice(69.99);

        List ToysAD = new ArrayList();
        ToysAD.add(t1);
        ToysAD.add(t2);
        ToysAD.add(t3);
        ToysAD.add(t4);
        ToysAD.add(t5);

        System.out.println("The number of toys is: "+ToysAD);

        Set ToysND = new HashSet();
        ToysND.add(t1);
        ToysND.add(t2);
        ToysND.add(t3);
        ToysND.add(t4);
        ToysND.add(t5);

        System.out.println("\nThe no. of toys in this set: "+ToysND);

        LinkedList toysList = new LinkedList(); 
        toysList.addToTail(t1);
        toysList.addToTail(t2);
        toysList.addToTail(t3);
        toysList.addToTail(t4);
        toysList.addToTail(t5);
        
        toysList.print();
    }
    
}
