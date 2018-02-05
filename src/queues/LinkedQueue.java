package queues;

import java.util.LinkedList;

/**
 * @author Liang,Yu(yxl5521)
 * @param <T> generic
 */
public class LinkedQueue<T> implements IQueue<T> {
    private boolean empty=false;
    LinkedList<T> myList=new LinkedList<>();

    /**
     * the size of the queue
     * @return the size of the queue/elements
     */
    public int size(){
        return myList.size();
    }

    /**
     * check if the queue is empty
     * @return true if it is empty, otherwise false.
     */
    public boolean isEmpty(){

        return empty;
    }

    /**
     * get the first goat in the queue
     * @return the first goat
     */
    public T front(){

        return myList.peek();
    }

    /**
     * put goat in the queue
     * @param goat the goat to put in
     */
    public void enqueue(T goat){
        myList.addLast(goat);
    }

    /**
     * remove the first goat
     * @return the removed goat.
     */
    public T dequeue(){
        return myList.removeFirst();

    }
}
