package queues;
import goats.BattleGoat;

import java.util.LinkedList;
public class LinkedQueue<T> implements IQueue<T> {
    private boolean empty=false;
    LinkedList<T> myList=new LinkedList<>();
    public int size(){
        return myList.size();
    }
    public boolean isEmpty(){

        return empty;
    }
    public T front(){

        return myList.peek();
    }
    public void enqueue(T goat){
        myList.addLast(goat);
    }
    public T dequeue(){
        return myList.removeFirst();

    }
}
