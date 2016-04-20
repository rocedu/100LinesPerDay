package ch04.stringtest;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("输入数字：");
            number = Long.parseLong(console.nextLine());
            sum += number;
        } while(number != 0);
        System.out.println("总和：" + sum);
    }
}