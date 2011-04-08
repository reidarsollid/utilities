package no.itera.objectware.utils.collections;

import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

import static org.junit.Assert.assertEquals;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 21.55
 */
public class QueueCreatorTest {
    @Test
    public void testNewQueue() throws Exception {
        Queue<String> stringQueue = QueueCreator.newQueue();
        Class<? extends Queue> actual = stringQueue.getClass();
        Class<? extends Queue> expected = LinkedList.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewDelayQueue() throws Exception {
        DelayQueue<MyDelayed> stringQueue = QueueCreator.newDelayQueue();
        Class<? extends Queue> actual = stringQueue.getClass();
        Class<? extends Queue> expected = DelayQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewSynchronousQueue() throws Exception {
        SynchronousQueue<String> synchronousQueue = QueueCreator.newSynchronousQueue();
        Class<? extends Queue> actual = synchronousQueue.getClass();
        Class<? extends Queue> expected = SynchronousQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewPriorityQueue() throws Exception {
        PriorityQueue<String> strings = QueueCreator.newPriorityQueue();
        Class<? extends Queue> actual = strings.getClass();
        Class<? extends Queue> expected = PriorityQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewPriorityBlockingQueue() throws Exception {
        PriorityBlockingQueue<String> strings = QueueCreator.newPriorityBlockingQueue();
        Class<? extends Queue> actual = strings.getClass();
        Class<? extends Queue> expected = PriorityBlockingQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLinkedBlockingQueue() throws Exception {
        LinkedBlockingQueue<String> stringLinkedBlockingQueue = QueueCreator.newLinkedBlockingQueue();
        Class<? extends Queue> actual = stringLinkedBlockingQueue.getClass();
        Class<? extends Queue> expected = LinkedBlockingQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLinkedBlockingDeque() throws Exception {
        LinkedBlockingDeque<String> linkedBlockingDeque = QueueCreator.newLinkedBlockingDeque();
        Class<? extends Queue> actual = linkedBlockingDeque.getClass();
        Class<? extends Queue> expected = LinkedBlockingDeque.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewArrayBlockingQueue() throws Exception {
        ArrayBlockingQueue<String> arrayBlockingQueue = QueueCreator.newArrayBlockingQueue(10, true);
        Class<? extends Queue> actual = arrayBlockingQueue.getClass();
        Class<? extends Queue> expected = ArrayBlockingQueue.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewConcurrentLinkedQueue() throws Exception {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = QueueCreator.newConcurrentLinkedQueue();
        Class<? extends Queue> actual = concurrentLinkedQueue.getClass();
        Class<? extends Queue> expected = ArrayBlockingQueue.class;
        assertEquals(expected, actual);
    }

    private class MyDelayed implements Delayed {

        public long getDelay(TimeUnit timeUnit) {
            switch (timeUnit) {
                case SECONDS:
                    return 42 - System.currentTimeMillis();
                default:
                    throw new IllegalArgumentException("TimeUnit should be string");
            }

        }

        public int compareTo(Delayed delayed) {
            return (int) (delayed.getDelay(TimeUnit.SECONDS) - getDelay(TimeUnit.SECONDS));
        }
    }
}
