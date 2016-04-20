package ch09.map;

import java.util.*;
import static java.lang.System.out;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();
        messages.put("Justin", "Hello！Justin的信息！");
        messages.put("Monica", "给Monica的悄悄話！");
        messages.put("Irene", "Irene的可爱猫喵喵叫！");
        
        Scanner console = new Scanner(System.in);
        out.print("取得谁的信息：");
        String message = messages.get(console.nextLine());
        out.println(message);
        out.println(messages);
    }
}
