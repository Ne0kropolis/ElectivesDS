package za.ac.cput.InterestingSociety.Deklerk;

public class Phone {


    private String phoneBrand;
    private int IMEI;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public String getType(){
        return phoneBrand;
    }

    public void setType(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public int getId() {
        return IMEI;
    }

    public void setId(int id) {
        this.IMEI = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        return IMEI == phone.IMEI;
    }

    @Override
    public int hashCode() {
        return IMEI;
    }
}