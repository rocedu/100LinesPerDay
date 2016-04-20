public class StringBufDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer(20);
        buffer.append('S');
        buffer.append("tringBuffer");
//        System.out.println(buffer.charAt(1));
        System.out.println(buffer.capacity());
//        System.out.println(buffer.indexOf("tring"));
        System.out.println("buffer = " + buffer.toString());
        System.out.println(buffer.length());
    }
}