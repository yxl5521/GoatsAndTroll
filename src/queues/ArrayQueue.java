package queues;

public class ArrayQueue<T> implements IQueue<T> {
    private int size;
    private T[] array;
    private int insert=0;
    private int remove=0;
    private int place;
    public int count=0;

    /**
     * the constructor for Cute array
     * @param size the size of the queue
     */
    public ArrayQueue(int size){
        this.size=size;
        array=(T[]) new Object[size];
    }

    /**
     * the size of the element inside the queue
     * @return the amount of the element
     */
    public int size(){
        return count;
    }

    /**
     * if the queue is empty
     * @return true if the queue is empty, false for not empty
     */
    public boolean isEmpty(){
        return count==0;
    }

    /**
     * get the front element of the queue
     * @return the first goat
     */
    public T front(){
        return array[remove];
    }

    /**
     * put the goat inside the queue, let them line up
     * @param goat the goat to put in
     */
    public void enqueue(T goat){
        count+=1;
        array[insert]=goat;
        if (insert<size-1){
            insert+=1;
        }
        else {
            insert=0;
        }
    }

    /**
     * take the first goat outside the queue
     * @return the goat taking out
     */
    public T dequeue(){
        int r=this.remove;
        count-=1;
        this.remove=(remove+1)%size;
        return array[r];


    }
}
