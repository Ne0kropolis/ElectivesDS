public class Bicycle {

    private int vinNum;
    private String color;

    public int getVinNum() {
        return vinNum;
    }

    public void setVinNum(int vinNum) {
        this.vinNum = vinNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bicycle = (Bicycle) o;

        return vinNum == bicycle.vinNum;
    }

    @Override
    public int hashCode() {
        return vinNum;
    }
}
