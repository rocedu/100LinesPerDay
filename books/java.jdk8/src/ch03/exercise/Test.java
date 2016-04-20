package ch03.exercise;

public class Test{
    public static void main(String[] args) {
        //1
        int number = 9;
        System.out.println(number);
        //2
        System.out.println("10/3 = " + 10 / 3);
        //3
        float radius = 88.2f;
        double area = 2 * 3.14 * radius * radius;
        System.out.println(area);
        //4
        byte a = 100;
        byte b = 100;
        byte c = (byte)(a + b);
        System.out.printf("c = %x %n", c);

        //5
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);

        //6
        System.out.println(-Integer.MAX_VALUE  == Integer.MIN_VALUE);

        //7
        int i = 10;
        number = i++;
        //number = --i;
        number = i--;
        System.out.println(i);
        System.out.println(number);

        //8
        i = 10;
        number = ++i;
        number = ++i;
        System.out.println(i);
        System.out.println(number);

        //8
        i = 10;
        number = ++i;
        number = ++i;

        //9
        for (i = 1; i < 10; i++) {
            if (i == 5)
                    continue;

        System.out.printf("i = %d %n" , i);
        }

        //10
        for (number = 0; number != 5 ; number = (int)(Math.random()*10)) {
            System.out.println(number);

        }
    }
}

