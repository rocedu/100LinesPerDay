package ch08.exercise;

public class Main1 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(number++);
        } catch ( ArrayIndexOutOfBoundsException ex) {
            System.out.println("必须输入数字");
        }
    }
}
