package exo4;

import java.util.Comparator;

public class ByFirstNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getFirstName().compareTo(p2.getFirstName());
    }
}