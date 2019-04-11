package exo4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5});
        int sum = 0;
        for (Integer i : list){
            sum += i;
        }
        System.out.println(sum);
    }
}
