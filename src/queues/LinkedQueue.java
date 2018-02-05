package queues;
import java.util.LinkedList;
public class LinkedQueue<T> implements IQueue<T> {
    public T front;
    public int size(){
        return 0;
    }
    public boolean isEmpty(){
        return false;
    }
    public T front(){ return front;
    }
    public void enqueue(T goat){

    }
    public T dequeue(){
        return front;

    }
}
