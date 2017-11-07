package za.ac.cput.InterestingSociety.Fortune;

/**
 *
 * @author Fortune Dederen
 * @std 216177758
 */
public class Product {
    
    private int productCode;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String manufacturer;

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdcutDescription() {
        return productDescription;
    }

    public void setProdcutDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.productCode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.productCode != other.productCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "productCode=" + productCode + ", Name=" + productName + ", Description=" + productDescription + ", Price=" + productPrice + ", Manufacturer=" + manufacturer + '}';
    }
    

    
}
