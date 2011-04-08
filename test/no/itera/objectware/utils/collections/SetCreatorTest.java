package no.itera.objectware.utils.collections;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

import static org.junit.Assert.assertEquals;

/**
 * User: Reidar Sollid
 * Date: 09.04.11
 * Time: 00.25
 */
public class SetCreatorTest {
    @Test
    public void testNewSet() throws Exception {
        Set<String> stringSet = SetCreator.newSet();
        Class<? extends Set> actual = stringSet.getClass();
        Class<? extends Set> expected = HashSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewSortedSet() throws Exception {
        SortedSet<String> stringSortedSet = SetCreator.newSortedSet();
        Class<? extends SortedSet> actual = stringSortedSet.getClass();
        Class<? extends SortedSet> expected = TreeSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewHashSet() throws Exception {
        HashSet<String> hashSet = SetCreator.newHashSet();
        Class<? extends Set> actual = hashSet.getClass();
        Class<? extends Set> expected = HashSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewTreeSet(){
        TreeSet<String> treeSet = SetCreator.newTreeSet();
        Class<? extends Set> actual = treeSet.getClass();
        Class<? extends Set> expected = TreeSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLinkedHashSet() throws Exception {
        LinkedHashSet<String> linkedHashSet = SetCreator.newLinkedHashSet();
        Class<? extends Set> actual = linkedHashSet.getClass();
        Class<? extends Set> expected = LinkedHashSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewConcurrentSkipListSet() throws Exception {
        ConcurrentSkipListSet<String> concurrentSkipListSet = SetCreator.newConcurrentSkipListSet();
        Class<? extends Set> actual = concurrentSkipListSet.getClass();
        Class<? extends Set> expected = ConcurrentSkipListSet.class;
        assertEquals(expected, actual);
    }

    @Test
    public void testNewCopyOnWriteArraySet() throws Exception {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = SetCreator.newCopyOnWriteArraySet();
        Class<? extends Set> actual = copyOnWriteArraySet.getClass();
        Class<? extends Set> expected = CopyOnWriteArraySet.class;
        assertEquals(expected, actual);
    }
}
