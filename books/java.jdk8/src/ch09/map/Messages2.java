package ch09.map;

import java.util.*;

public class Messages2 {
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>(); 
        messages.put("Justin", "Hello！Justin的信息！");
        messages.put("Monica", "给Monica的悄悄话！");
        messages.put("Irene", "Irene的可爱猫喵喵叫！");
        System.out.println(messages);
    }
}
