package GenericQueue;

import java.util.LinkedList;

public class genericMain {
    public static void main(String[] args) {
        GenericQueue<Integer> queue=new GenericQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);


        System.out.println("after added elements :"+queue);
        System.out.println("show 1st elemet:"+queue.deQueue());
        queue.isEmpty();



    }
}
