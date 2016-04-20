package ch04.arraytest;

public class XY {

    public static void main(String[] args) {
        int[][] cords = {
                {1, 2, 3},
                {4, 5, 6}
        };
     /* 补上代码*/

        for (int x = 0; x < cords.length ; x++) {
            for (int y = 0; y < cords[x].length; y++) {
                System.out.printf("%2d",  cords[x][y]);
            }
            System.out.println();
        }

         for (int [] row: cords) {
            for (int value: row) {
                System.out.printf("%2d",  value);
            }
            System.out.println();
        }


    }
}
