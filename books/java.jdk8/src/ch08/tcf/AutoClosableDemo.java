package ch08.tcf;

public class AutoClosableDemo {    
    public static void main(String[] args) {
        try(Resource res = new Resource()) {
            res.doSome();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("作一些事");
    }
    @Override
    public void close() throws Exception {
        System.out.println("资源被关闭");
    }
}