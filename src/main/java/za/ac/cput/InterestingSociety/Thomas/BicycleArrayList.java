import java.util.*;

public class BicycleArrayList
{
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle();
        b1.setColor("Red");
        b1.setVinNum(98765);

        Bicycle b2 = new Bicycle();
        b2.setColor("Silver");
        b2.setVinNum(56789);

        Bicycle b3 = new Bicycle();
        b3.setColor("Blue");
        b3.setVinNum(43215);

        Bicycle b4 = new Bicycle();
        b4.setColor("Red");
        b4.setVinNum(98765);

        Bicycle b5 = new Bicycle();
        b5.setColor("Green");
        b5.setVinNum(67890);


        List bicycleArray = new ArrayList();
        bicycleArray.add(b1);
        bicycleArray.add(b2);
        bicycleArray.add(b3);
        bicycleArray.add(b4);
        bicycleArray.add(b5);

        System.out.println("The number of bicycels is: "+bicycleArray.size());


        Set bicycleND = new HashSet();

        bicycleND.add(b1);
        bicycleND.add(b2);
        bicycleND.add(b3);
        bicycleND.add(b4);
        bicycleND.add(b5);

        System.out.println("\nThe no. of bicycels in this set: "+bicycleND.size());


        BicycleLinkedList bicycleList = new BicycleLinkedList();
        bicycleList.addToTail(b1);
        bicycleList.addToTail(b2);
        bicycleList.addToTail(b3);
        bicycleList.addToTail(b4);
        bicycleList.addToTail(b5);

        bicycleList.print();

    }




}
