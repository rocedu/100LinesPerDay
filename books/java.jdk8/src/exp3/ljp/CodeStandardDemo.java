package exp3.ljp;

/**
 * Created by rocedu on 2016/4/22.
 */
public class CodeStandardDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append('S');
        buffer.append("tringBuffer");
        System.out.println(buffer.charAt(1));
        System.out.println(buffer.capacity());
        System.out.println(buffer.indexOf("tring"));
        System.out.println("buffer = " + buffer.toString());

        if (buffer.capacity() < 20)
            buffer.append("1234567");

        for (int i = 0; i < buffer.length(); i++)
            System.out.println(buffer.charAt(i));
    }

}
