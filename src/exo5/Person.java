package exo5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private final String name;
    private final String avs;
    public Person(String name, String avs) {
        this.name = name;
        this.avs = avs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,avs);
    }

    @Override
    public boolean equals(Object obj) {
        Person o = (Person)obj;
        if(this.avs == o.avs && this.name == o.name){
            return true;
        }
        return false;
    }

    public static void main(String... args) {
        Person p1 = new Person("John Doe", "756-1234-5678-97");
        Person p2 = new Person("John Doe", "756-1234-5678-97");
        Person p3 = new Person("John Amden", "111-11-111-113");
        Set persons = new HashSet();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.size());
        System.out.println(p1.equals(p2));
    }
}
