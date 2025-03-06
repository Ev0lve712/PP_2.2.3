package web.model;

public class Cars {

    String name;
    int year;
    String color;

    public Cars(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "cars {" +
                "name = '" + name + '\'' +
                ", year = " + year +
                ", color = '" + color + '\'' +
                '}';
    }
}
