/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.InterestingSociety.Russel;

public class Computer {

    private String model;
    private int macAddress;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(int macAddress) {
        this.macAddress = macAddress;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Computer computer = (Computer) object;

        if (macAddress != computer.macAddress) return false;
        if (model != null ? !model.equals(computer.model) : computer.model != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + macAddress;
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", macAddress=" + macAddress +
                '}';
    }


}



