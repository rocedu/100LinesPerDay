package ch08.exercise;

public class Main3 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number++);
        } catch (NumberFormatException ex) {
            System.out.println("必须输入数字");
        }
    }
}
