package ch04.exercise;

public class Test {
    public static void main(String[] args) {
        //1,2,3
        int x = 300;
        int y = 300;
        Integer wx = x;
        Integer wy = y;
        System.out.println(x == wx);
        System.out.println(y == wy);

        System.out.println(x == y);
        System.out.println(wx == wy);

        System.out.println(wx.equals(x));
        System.out.println(wy.equals(y));

        //4
        int [] arr1 = {1, 2, 3};
        int [] arr2 = arr1;
        arr2[1] = 20;
        System.out.println(arr1[1]);

        //5
        int [] arr3 = new int[arr1.length];
        arr3 = arr1;
        for(int value: arr3){
            System.out.println(value);
        }

        //5
        String [] strs = new String[5];
        System.out.println(strs[0]);
        //8
        String [][] strss = new String[2][5];
        System.out.println(strss[0][0]);

        //9
        String [][] strs1 = {
                {"Java", "Java", "Java"},
                {"Java", "Java", "Java","Java"}
        };
        System.out.println(strs1.length);
        System.out.println(strs1[0].length);
        System.out.println(strs1[1].length);


    }
}
