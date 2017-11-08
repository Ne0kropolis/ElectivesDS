/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rowan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author dajew
 */
public class TrainApp {
        public static void main(String[] args) {

        Train t1 = new Train("Valente",01224,true);
        Train t2 = new Train("Ipe",01334,false);
        Train t3 = new Train("Firema Trasporti",01155,true);
        Train t4 = new Train("Vado Ligure",01532,true);




        List trainAd = new ArrayList();
        trainAd.add(t1);
        trainAd.add(t2);
        trainAd.add(t3);
        trainAd.add(t4);

        System.out.println("The number of trains: "+trainAd.size());

        Set trainNd = new HashSet();
        trainNd.add(t1);
        trainNd.add(t2);
        trainNd.add(t3);
        trainNd.add(t4);

        System.out.println("\nThe number of trains in this set: "+trainNd.size());

        TrainLinkedList trainList = new TrainLinkedList();
        trainList.addToTail(t1);
        trainList.addToTail(t2);
        trainList.addToTail(t3);
        trainList.addToTail(t4);

        trainList.print();
    }
}
