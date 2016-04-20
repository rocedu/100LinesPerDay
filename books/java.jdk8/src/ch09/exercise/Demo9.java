package ch09.exercise;

/**
 * Created by rocedu on 2016/4/7.
 */
import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
