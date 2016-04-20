package ch06;

/**
 * Created by rocedu on 2016/3/31.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //toString
        System.out.println(list);

        //equals
        System.out.println(list.equals(list));//true

        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println(list.equals(list1));//true

        ArrayList list2 = new ArrayList();
        list1.add("1");
        list1.add("22");
        list1.add("3");
        System.out.println(list.equals(list2));//false

    }
}
