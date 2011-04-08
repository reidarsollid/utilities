package no.itera.objectware.utils.collections;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 16.07
 */
public class ListCreatorTest {
    @Test
    public void testNewList() throws Exception {
        List<String> stringList = ListCreator.newList();
        Class<? extends List> actual = stringList.getClass();
        Class<? extends List> expected = ArrayList.class;
        assertEquals(expected,actual);
    }

    @Test
    public void testNewArrayList() throws Exception {
        ArrayList<String> stringList = ListCreator.newArrayList();
        Class<? extends List> actual = stringList.getClass();
        Class<? extends List> expected = ArrayList.class;
        assertEquals(expected,actual);
    }

    @Test
    public void testNewLinkedList() throws Exception {
        LinkedList<String> stringList = ListCreator.newLinkedList();
        Class<? extends List> actual = stringList.getClass();
        Class<? extends List> expected = LinkedList.class;
        assertEquals(expected,actual);
    }

    @Test
    public void testNewCopyOnWriteArrayList() throws Exception {
        CopyOnWriteArrayList<String> strings = ListCreator.newCopyOnWriteArrayList();
        Class<? extends List> actual = strings.getClass();
        Class<? extends List> expected = CopyOnWriteArrayList.class;
        assertEquals(expected,actual);
    }
}
