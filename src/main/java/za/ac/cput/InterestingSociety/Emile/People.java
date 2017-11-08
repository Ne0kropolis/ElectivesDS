package za.ac.cput.InterestingSociety.Emile;

/**
 *
 * @author Emile De Klerk
 * @std 214172430
 */
public class People {
    
    private String identificationNumber;
    private String name ;

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        People people = (People) object;

        if (identificationNumber != null ? !identificationNumber.equals(people.identificationNumber) : people.identificationNumber != null)
            return false;
        return name != null ? name.equals(people.name) : people.name == null;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (identificationNumber != null ? identificationNumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "People{" +
                "identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
