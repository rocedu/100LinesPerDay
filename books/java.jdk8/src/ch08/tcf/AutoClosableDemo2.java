package ch08.tcf;

import static java.lang.System.out;

public class AutoClosableDemo2 {    
    public static void main(String[] args) {
        try(ResourceSome some = new ResourceSome();
             ResourceOther other = new ResourceOther()) {
            some.doSome();
            other.doOther();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ResourceSome implements AutoCloseable {
    void doSome() {
        out.println("作一些事");
    }
    @Override
    public void close() throws Exception {
        out.println("资源Some被关闭");
    }
}

class ResourceOther implements AutoCloseable {
    void doOther() {
        out.println("作其它事");
    }
    @Override
    public void close() throws Exception {
        out.println("资源Other被关闭");
    }
}