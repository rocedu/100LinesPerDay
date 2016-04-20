package ch04;
public class TestJavaClass {
    public static void main(String[] args) {
        p87TestFloatEquals();
        p92TestBoxing();
        p110StringTest();
    }

    public static void p87TestFloatEquals() {
        double a = 0.1;
        double b = 0.1;
        double c = 0.1;

        if ((a+b+c) == 0.3){
            System.out.println("等于0.3");
        } else {
            System.out.println("不等于0.3");
        }

    }

    public static void p92TestBoxing() {
        Number number = 3.14;
        System.out.println("number= " + number);

        Integer wrappper = 10;
        int foo = wrappper;
        System.out.println("foo = " + foo);

        Integer i = 10;
        System.out.println(i + 10);
        System.out.println(i++);
        System.out.println(i);

        Boolean foo1 = true;
        System.out.println( foo1 && false);

        Integer ii = 0;//null;
        int j = ii;
        System.out.println("j = " + j);

        Integer i1 = 100;
        Integer i2 = 100;
        if (i1 == i2){
            System.out.println("i1 == i2");
        } else {
            System.out.println("i1 != i2");
        }

        Integer i3 = 200;
        Integer i4 = 200;
        if (i3 == i4){
            System.out.println("i3 == i4");
        } else {
            System.out.println("i3 != i4");
        }
    }

    public static void p110StringTest() {
        char [] name = {'L','J','P'};
        String name1 = new String(name);
        String name2 = new String(name);
        System.out.println(name1 == name2);

        String name11 = "LJP";
        String name22 = "LJP";
        System.out.println(name11 == name22);

        System.out.println(name1 == name11);
        System.out.println(name2 == name22);

        System.out.println(name1.equals(name11));
        System.out.println(name2.equals(name22));

    }
}
