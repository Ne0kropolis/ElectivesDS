/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Teagan;

public class Toys {

    private String type;
    private int factoryId;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return factoryId;
    }

    public void setId(int id) {
        this.factoryId = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toys toys = (Toys) o;

        return factoryId == toys.factoryId;
    }

    @Override
    public int hashCode() {
        return factoryId;
    }
}



