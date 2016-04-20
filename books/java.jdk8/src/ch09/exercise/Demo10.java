package ch09.exercise;

/**
 * Created by rocedu on 2016/4/7.
 */
import java.util.*;
public class Demo10 {
    public static void main(String[] args) {
        Map<String, String> message = new HashMap<>();
        message.put("J", "Hello");
        message.put("M","HiHi");
        foreach(message.values());
    }

    private static void foreach(Collection<String> values){
        for(String value: values){
            System.out.println(value);
        }

    }
}
