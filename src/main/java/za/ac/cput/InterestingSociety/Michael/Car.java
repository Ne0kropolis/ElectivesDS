package za.ac.cput.InterestingSociety.Michael;

import org.w3c.dom.Node;

/**
 * Created by learn23 on 11/7/2017.
 */
public class Car {
    public Car() {
    }


    private int vin = 0;
    private String model;
    private int wheels = 0;
    private String colour;

    public Car(int vin, String model,  String colour, int wheels) {
        this.vin = vin;
        this.model = model;
        this.wheels = wheels;
        this.colour = colour;
    }

    public int getVin() {
        return vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return vin == car.vin;
    }

    @Override
    public int hashCode() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
