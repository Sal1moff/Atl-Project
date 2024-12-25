package GenericQueue;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> myList;

    public GenericQueue() {
        this.myList = new LinkedList<>();
    }

    public void enQueue(T add) {
        myList.addLast(add);
    }

    public T deQueue() {
    if(myList.isEmpty()==true){
        System.out.println("We have not a element in generic");
    }
        return myList.getFirst();

    }

    @Override
    public String toString() {
        return "GenericQueue{" +
                "myList=" + myList +
                '}';
    }

    public void isEmpty() {
        if (myList.isEmpty()==true) {
            System.out.println("List is empty");
        }
        System.out.println("We have a element in generic");
    }

}


