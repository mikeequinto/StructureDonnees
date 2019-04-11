package exo4;

import java.util.Comparator;

public class Comparateur implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1.getClass().getName() == "java.lang.String"){
            String s1 = (String)o1;
            String s2 = (String)o2;
            return s1.compareTo(s2);
        }
        else{
            Integer i1 = (Integer)o1;
            Integer i2 = (Integer)o2;
            return i1 - i2;
        }
    }
}
