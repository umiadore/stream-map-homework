package Task2;
//4. У вас есть список из людей, найдите среди них всех мам и пап, у которых имя длиннее 6 букв
//Либо Stream.of(), либо делаем по отдельности (способ Владимира)

//Дополнение: важно поработать со стримами, но разрешается где-то какое-то действие выполнить без них

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person karina = new Person("Karina");
        Person matvei = new Person("Matvei");
        Person marlena = new Person("Marlena");
        Person arstanie = new Person("Arstanie");
        Person karlen = new Person("Karlen");
        Person mira = new Person("Mira");

        List<Person> parents = new ArrayList<>();
        parents.add(karina);
        parents.add(marlena);
        parents.add(matvei);
        parents.add(arstanie);
        parents.add(karlen);
        parents.add(mira);

        Optional<Integer> pp = parents.stream()
                        .filter(a -> a.getName().length() > 6)
                        .flatMap(x -> Stream.of(x.getDad(), x.getMom())


    }
}
