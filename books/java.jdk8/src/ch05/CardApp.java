package ch05;

import java.util.Scanner;

public class CardApp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        CashCard card1 = new CashCard("A001", 500, 0);


        CashCard card2 = new CashCard("A002", 300, 0);

        CashCard card3 = new CashCard("A003", 1000, 1);

    }
}
