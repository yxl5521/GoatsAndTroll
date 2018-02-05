package queues;

public interface IQueue<T> {
    int size();
    boolean isEmpty();
    T front();
    void enqueue(T goat);
    T dequeue();

}
