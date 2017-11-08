/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Russel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComputerArrayList {

    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.setMacAddress(00-58-69-41-36-42);
        c1.setModel("Samsung");


        Computer c2 = new Computer();
        c2.setMacAddress(00-15-26-50-30-40);
        c2.setModel("HP");

        Computer c3 = new Computer();
        c3.setMacAddress(01-56-58-41-96-52);
        c3.setModel("Lenovo");

        Computer c4 = new Computer();
        c4.setMacAddress(23-26-45-18-82-59);
        c4.setModel("Phillips");

        Computer c5 = new Computer();
        c5.setMacAddress(58-75-89-85-95-96);
        c5.setModel("LG");

        List computerArray = new ArrayList();
        computerArray.add(c1);
        computerArray.add(c2);
        computerArray.add(c3);
        computerArray.add(c4);
        computerArray.add(c5);

        System.out.println("The number of Computers is: "+computerArray);

        Set computerND = new HashSet();
        computerND.add(c1);
        computerND.add(c2);
        computerND.add(c3);
        computerND.add(c4);
        computerND.add(c5);

        System.out.println("\nThe no. of Computers in this set: "+computerND);

        LinkedList computerList = new LinkedList();
        computerList.addToTail(c1);
        computerList.addToTail(c2);
        computerList.addToTail(c3);
        computerList.addToTail(c4);
        computerList.addToTail(c5);
        
        computerList.print();
    }
    
}
