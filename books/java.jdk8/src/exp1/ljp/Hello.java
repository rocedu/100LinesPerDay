package exp1.ljp;

/**
 * Created by rocedu on 2016/4/14.
 */

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
         System.out.println("Input your first name, please:");
         Scanner s = new Scanner(System.in);
         String name = s.next();
         System.out.println("Hello " + name + " !");
    }
}
