package Task1;

import java.util.Objects;

//Создайте класс "Машина"
//у нее будет 3 поля: наименование марки, год выпуска и пробег
public class Car {
    private String brand;
    private int year;
    private int km;

    public Car(String brand, int year, int km) {
        this.brand = brand;
        this.year = year;
        this.km = km;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && km == car.km && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year, km);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", km=" + km +
                '}';
    }
}
