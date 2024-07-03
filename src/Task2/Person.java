package Task2;

import java.util.Objects;

//Создайте класс Person, у него будет три поля: имя, папа и мама. Папа и мама - тоже поля класса Person
public class Person {
    private  String name;
    private String mom;
    private String dad;

    public Person(String name, String mom, String dad) {
        this.name = name;
        this.mom = mom;
        this.dad = dad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMom() {
        return mom;
    }

    public void setMom(String mom) {
        this.mom = mom;
    }

    public String getDad() {
        return dad;
    }

    public void setDad(String dad) {
        this.dad = dad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(mom, person.mom) && Objects.equals(dad, person.dad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mom, dad);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mom='" + mom + '\'' +
                ", dad='" + dad + '\'' +
                '}';
    }
}
