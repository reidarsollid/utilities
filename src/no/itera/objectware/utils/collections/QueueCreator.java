package no.itera.objectware.utils.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 15.48
 */
public class QueueCreator {
    public static <E> Queue<E> newQueue() {
        return new LinkedList<E>();
    }

    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new LinkedBlockingQueue<E>();
    }

    public static <E>LinkedBlockingDeque<E> newLinkedBlockingDeque(){
        return new LinkedBlockingDeque<E>();
    }

    public static <E>PriorityQueue<E> newPriorityQueue(){
        return new PriorityQueue<E>();
    }
}
