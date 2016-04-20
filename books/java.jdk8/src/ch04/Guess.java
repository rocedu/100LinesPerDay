package ch04;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        //补代码
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess ;
        
        do {
            System.out.print("猜数字（0 ~ 9）:");
            guess = scanner.nextInt(); // 补代码
        } while(guess != number);
        
        System.out.println("猜中了...XD");
    }
}
