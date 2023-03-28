public class Data {
    private int year;
    private String model;
    private int prise;
    private String color;

    public Data(int year, String model, int prise, String color) {
        this.year = year;
        this.model = model;
        this.prise = prise;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }

}
