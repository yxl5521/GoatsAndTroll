package queues;

public class ArrayQueue<T> implements IQueue<T> {

    public int size(){
        return 10;
    }
    public boolean isEmpty(){
        return false;
    }
    public T front(){
        T[] array;
        array=(T[]) new Object[size()];
        return array[0];
    }
    public void enqueue(T goat){
        T[] array;
        array=(T[]) new Object[size()];

    }
    public T dequeue(){
        T[] array;
        array=(T[]) new Object[size()];
        return array[0];


    }


}
