package queues;

/**
 * @author Liang,Yu (yxl5521)
 * @param <T> generic
 */

public interface IQueue<T> {
    /**
     * the size of the element inside
     * @return the size of the list
     */
    int size();

    /**
     * check whether the queue is empty
     * @return true or false
     */
    boolean isEmpty();

    /**
     * get the first goat
     * @return the first goat
     */
    T front();

    /**
     * put the goats in
     * @param goat the goat to put in
     */
    void enqueue(T goat);

    /**
     * get the first goat out
     * @return the removed goat
     */
    T dequeue();

}
