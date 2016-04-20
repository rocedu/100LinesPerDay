package ch11;

import static java.lang.System.out;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        out.println("Main thread 开始...");

        Thread threadB = new Thread(() -> {
            out.println("Thread B 开始...");
            for (int i = 0; i < 5; i++) {
                out.println("Thread B 执行...");
            }
            out.println("Thread B 将结束...");
        });

        threadB.start();
        //threadB.join(); // Thread B 加入 Main thread 流程

        out.println("Main thread将结束...");
    }
}
