package ch05.exercise;

public class Some4 {
    private int x;
    public Some4(){}
    public Some4(int x){
        //Xx = x;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static int sum(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Some4 s = new Some4(10);
        System.out.println(s.getX());

        System.out.println(Some4.sum(1, 2, 3));
        System.out.println(new Some4().sum(1, 2, 3));
    }
}
