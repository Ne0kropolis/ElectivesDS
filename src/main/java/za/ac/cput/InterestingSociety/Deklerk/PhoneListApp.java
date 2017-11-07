package za.ac.cput.InterestingSociety.Deklerk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneListApp {

    public static void main(String[] args) {

        Phone t1 = new Phone();
        t1.setId(4927581);
        t1.setType("Samsung");
        t1.setPrice(5000.00);

        Phone t2 = new Phone();
        t2.setId(49433952);
        t2.setType("iPhone");
        t2.setPrice(4000.00);

        Phone t3 = new Phone();
        t3.setId(491101508);
        t3.setType("Nokai");
        t3.setPrice(8800.00);

        Phone t4 = new Phone();
        t4.setId(54630701);
        t4.setType("Blackberry");
        t4.setPrice(1000.00);



        List phoneAd = new ArrayList();
        phoneAd.add(t1);
        phoneAd.add(t2);
        phoneAd.add(t3);
        phoneAd.add(t4);

        System.out.println("The number of phones: "+phoneAd.size());

        Set phoneNd = new HashSet();
        phoneNd.add(t1);
        phoneNd.add(t2);
        phoneNd.add(t3);
        phoneNd.add(t4);

        System.out.println("\nThe number of phones in this set: "+phoneNd.size());

        PhoneLinkedList phoneList = new PhoneLinkedList();
        phoneList.addToTail(t1);
        phoneList.addToTail(t2);
        phoneList.addToTail(t3);
        phoneList.addToTail(t4);

        phoneList.print();
    }

}
