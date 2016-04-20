package ch05.exercise;

public class Some1 {
    private static Some1 some;
    private Some1(){};
    public static Some1 create(){
        if (some == null) {
            some = new Some1();
        }
        System.out.println("Some1 ok");
        return some;
    }

    public static void main(String[] args) {
        Some1 s = Some1.create();
    }
}
