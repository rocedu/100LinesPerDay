package ch04;

class Clothes2 {
    String color;
    char size;
    /*
     * 补上构造函数
     */
    Clothes2(String color, char size){
        this.color = color;
        this.size = size;
    }
}

public class Field2 {
    public static void main(String[] args) {
        // 按照范例修改以下內容
        Clothes2 sun = new Clothes2("red", 'S');
        Clothes2 spring = new Clothes2("green", 'M');
        //Clothes2 autumn = new Clothes2();

        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}