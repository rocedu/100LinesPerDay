package ch12;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        Arrays.sort(names, (name1, name2) -> name2.length() - name1.length());
        System.out.println(Arrays.toString(names));
    }
}
