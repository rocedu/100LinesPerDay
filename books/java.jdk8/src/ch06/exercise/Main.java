package ch06.exercise;

 class Some {
     Some(){
         this(10);
         System.out.println("Some()");
     }

     Some(int x) {
         System.out.println("Some(int x)");
     }
}

class Other extends Some{
    Other() {
        super(10);
        System.out.println("Other()");
    }

    Other( int y){
        System.out.println("Other(int y)");
    }
}
public class Main {
    public static void main(String[] args) {
        new Other();
    }
}
