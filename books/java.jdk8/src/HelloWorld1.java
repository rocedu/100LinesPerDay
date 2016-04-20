import java.math.BigDecimal;

/**
 * Created by rocedu on 2016/3/10.
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BigDecimal a = new BigDecimal("4");
        BigDecimal b = new BigDecimal("3");
        System.out.println(a.divide(b));
    }
}
