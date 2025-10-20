package Collections.Queue.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class BasicExample
{
    public static void main(String[] args) throws InterruptedException{
        PriorityBlockingQueue<String> pbq =new PriorityBlockingQueue<String>(3);
        pbq.add("a");
        pbq.add("c");
        pbq.add("b");
        System.out.println(pbq.contains("b"));
        System.out.println(pbq.take());
        System.out.println(pbq);
    }
}
