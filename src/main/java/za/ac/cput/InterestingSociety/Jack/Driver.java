package za.ac.cput.InterestingSociety.Jack;

/**
 *
 * @author Jack Forde
 * @std 216238684
 *
 */

import java.util.*;

public class Driver {

    private ArrayList<Pilot> pilotsArrayList = new ArrayList<Pilot>();
    private Set<Pilot> pilotsSet = new HashSet<Pilot>();
    private MyLinkedList pilotsLinkedList = new MyLinkedList();

    private void run() {

        //Create objects
        Pilot p1 = new Pilot("Sailor", "Group Captain", "Adolph", "Malan", new Date(10,2,24), new Date(36,0,6));
        Pilot p2 = new Pilot("Dogsbody", "Group Captain", "Douglas", "Bader", new Date(10,1,21), new Date(28,8,13));
        Pilot p3 = new Pilot("Johnnie", "Air Vice Marshal", "Johnnie", "Johnson", new Date(15,2,9), new Date(39,11,1));
        Pilot p4 = new Pilot("Buzz", "Flight Lieutenant", "George", "Beurling", new Date(21,11,6), new Date(40,8,1));
        Pilot p5 = new Pilot("Warby", "Wing Commander", "Adrian", "Warburton", new Date(18,2,10), new Date(39,8,3));

        //Add objects to ArrayList
        pilotsArrayList.add(p1);
        pilotsArrayList.add(p2);
        pilotsArrayList.add(p3);
        pilotsArrayList.add(p4);
        pilotsArrayList.add(p5);

        System.out.println("ArrayList: " + pilotsArrayList.toString() + "\nSize: " + pilotsArrayList.size());

        //Add objects to HashSet
        pilotsSet.add(p1);
        pilotsSet.add(p2);
        pilotsSet.add(p3);
        pilotsSet.add(p4);
        pilotsSet.add(p5);

        System.out.println("HashSet: " + pilotsSet.toString() + "\nSize: " + pilotsSet.size());

        //Add objects to LinkedList
        pilotsLinkedList.addAtHead(p1);
        pilotsLinkedList.addToTail(p2);
        pilotsLinkedList.addToTail(p3);
        pilotsLinkedList.InsertNth(p4, 2);
        pilotsLinkedList.addSorted(p5);

        pilotsLinkedList.print();
    }

    public static void main(String[] args) {

        new Driver().run();
    }
}
