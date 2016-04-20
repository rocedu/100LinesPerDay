package ch03;

public class NineNineTableLjp {
    public static void main(String[] args) {
        for(int j = 1; j < 10; j++) { 
           for(int i = 1; i <= j; i++) {
               System.out.printf("%d*%d=%2d ",i, j,  i * j);
           } 
           System.out.println(); 
        }  
    }
}
