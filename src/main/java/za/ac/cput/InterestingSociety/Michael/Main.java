package za.ac.cput.InterestingSociety.Michael;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1, "ford","black",6);
        Car car2 = new Car(2, "toyota","red", 4);
        Car car3 = new Car(3, "honda", "white", 4);
        Car car4 = new Car(4, "toyota","red", 10);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);



        Set othercars = new HashSet();

        othercars.addAll(cars);

        LinkedList carList = new LinkedList();

        carList.addToTail(car1);
        carList.addToTail(car2);
        carList.addToTail(car3);
        carList.addToTail(car4);



        System.out.println("The size of cars is "+cars.size());
        System.out.println("The size of othercars is "+othercars.size());
        System.out.println("The carsList is ");
        carList.print();


    }
}
