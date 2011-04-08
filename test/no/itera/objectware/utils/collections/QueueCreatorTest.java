package no.itera.objectware.utils.collections;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 16.26
 */
public class QueueCreatorTest {
    @Test
    public void testNewQueue() throws Exception {
        Queue<String> stringQueue = QueueCreator.newQueue();
        Class<? extends Queue> actual = stringQueue.getClass();
        Class<? extends Queue> expected = LinkedList.class;
        assertEquals(expected,actual);
    }

    @Test
    public void testNewLinkedBlockingQueue() throws Exception {
        LinkedBlockingQueue<String> stringLinkedBlockingQueue = QueueCreator.newLinkedBlockingQueue();
        Class<? extends Queue> actual = stringLinkedBlockingQueue.getClass();
        Class<? extends Queue> expected = LinkedBlockingQueue.class;
        assertEquals(expected,actual);
    }

    @Test
    public void testNewLinkedBlockingDeque() throws Exception {
        LinkedBlockingDeque<String> linkedBlockingDeque = QueueCreator.newLinkedBlockingDeque();
        Class<? extends Queue> actual = linkedBlockingDeque.getClass();
        Class<? extends Queue> expected = LinkedBlockingDeque.class;
        assertEquals(expected,actual);
    }
}
