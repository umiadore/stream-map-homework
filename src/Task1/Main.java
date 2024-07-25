package Task1;

import com.sun.source.tree.OpensTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 2009,550_000);
        Car car2 = new Car("Volvo", 2005,150_000);
        Car car3 = new Car("Vortex", 2012,500_000);
        Car car4 = new Car("Volga", 1999,300_000);
        Car car5 = new Car("Wiesmann", 2008,510_000);
        Car car6= new Car("Toyota", 2005,550_000);
        Car car7 = new Car("KIA", 2018,510_000);
        Car car8 = new Car("Volkswagen", 2005,550_000);

        List <Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
        carsList.add(car6);
        carsList.add(car7);
        carsList.add(car8);

//1. Среди машин, которые имеют год выпуска новее, чем 1999 необходимо подсчитать общий пробег
        Optional <Integer> optional = carsList.stream()
                .filter(car -> car.getYear() >1999)
                .map(car -> car.getKm())
                .reduce((x,y) -> x +y);

        System.out.println("Общий пробег: " + optional.orElse(0));

 //2. Среди машин, у которых пробег более 500 000 найти самую старую

        Optional <Integer> min = carsList.stream()
        .filter(car -> car.getKm() > 500_000)
                .map(car -> car.getYear())
                        .min(Comparator.naturalOrder());
        System.out.println("Самая старая машина, у которой пробег более 500_000 км: " + min);

//3. Среди машин, у которых марка начинается на "V" или "W" найти с самым большим пробегом, но не более 200 000 тысяч

        Optional <Integer> max = carsList.stream()
                .filter(car -> car.getBrand().startsWith("V"))
                .filter(car -> car.getBrand().startsWith("W"))
                .filter(car -> car.getKm() <= 200_000)
                .map(car -> car.getKm())
                .max(Comparator.naturalOrder());

        System.out.println("Машина на V || W , с пробегом не более 200_000 км: " + max);






    }
}
