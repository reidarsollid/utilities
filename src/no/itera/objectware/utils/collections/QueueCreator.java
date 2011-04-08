package no.itera.objectware.utils.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 15.48
 */
public class QueueCreator {
    public static <E> Queue<E> newQueue() {
        return new LinkedList<E>();
    }

    public static <E extends Delayed> DelayQueue<E> newDelayQueue(){
        return new DelayQueue<E>();
    }

    public static <E>SynchronousQueue<E> newSynchronousQueue(){
        return new SynchronousQueue<E>();
    }

    public static <E>PriorityQueue<E> newPriorityQueue(){
        return new PriorityQueue<E>();
    }

    public static <E>PriorityBlockingQueue<E> newPriorityBlockingQueue(){
        return new PriorityBlockingQueue<E>();
    }

    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new LinkedBlockingQueue<E>();
    }

    public static <E>LinkedBlockingDeque<E> newLinkedBlockingDeque(){
        return new LinkedBlockingDeque<E>();
    }

    public static <E>ArrayBlockingQueue<E> newArrayBlockingQueue(int capacity, boolean fair){
        return new ArrayBlockingQueue<E>(capacity,fair);
    }

    public static <E>ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(){
        return new ConcurrentLinkedQueue<E>();
    }
}
