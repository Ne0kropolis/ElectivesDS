package za.ac.cput.InterestingSociety.Jack;

/**
 *
 * @author Jack Forde
 * @std 216238684
 *
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pilot {

    private String callsign;
    private String rank;
    private String fName;
    private String lName;
    private Date dob;
    private Date doc;

    public Pilot(String in_callsign, String in_rank, String in_fName, String in_lName, Date in_dob, Date in_doc) {
        this.callsign = in_callsign;
        this.rank = in_rank;
        this.fName = in_fName;
        this.lName = in_lName;
        this.dob = in_dob;
        this.doc = in_doc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pilot pilot = (Pilot) o;

        return callsign.equals(pilot.callsign);

    }

    @Override
    public int hashCode() {
        return callsign.hashCode();
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoc() {
        return doc;
    }

    public void setDoc(Date doc) {
        this.doc = doc;
    }

    public String toString() {

        SimpleDateFormat sf = new SimpleDateFormat("E dd/MM/yyyy");

        return ("Callsign: " + this.callsign + "\nRank: " + this.rank + "\nFirst Name: " + this.fName + "\nLast Name: " + this.lName +
                "\nDate of Birth: " + sf.format(this.dob) + "\nDate of Conscription: " + sf.format(this.doc));
    }
}
