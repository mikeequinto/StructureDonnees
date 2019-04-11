package exo4;

import java.util.Comparator;

public class ByLastNameComparator implements Comparator {

    private ByFirstNameComparator firstNameComparator;

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        if(p1.getLastName().compareTo(p2.getLastName()) == 0){
            return firstNameComparator.compare(o1,o2);
        }else{
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }
}