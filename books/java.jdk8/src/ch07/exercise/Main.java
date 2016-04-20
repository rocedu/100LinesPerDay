package ch07.exercise;

interface Some{
   //protected void doSome();
    void doSome();
   //int  x = 10;

}
abstract class AbstractSome implements Some{
    public abstract void doSome();
    public void doService() {
        System.out.println("do service");
    }
}
interface Other{
    void doOther();
}
class SomeImpl implements Some, Other {
    public void doSome(){
        System.out.println("do something");
    }

    public void doOther(){
        System.out.println("do other thing");
    }
}
public class Main {
    public static void main(String[] args) {
        Some s = new SomeImpl();
        s.doSome();
        Other o = (Other) s;
        o.doOther();
//        System.out.println(Some.x);

        Some as = new Some() {
            @Override
            public void doSome() {
                System.out.println("do something");
            }

            public void doService() {
            }
        };
//        as.doService();
    }
}
