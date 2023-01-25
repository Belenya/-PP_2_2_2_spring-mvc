package web.model;

public class Car {
    private String model;
    private int series;
    private int year;

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }
}
