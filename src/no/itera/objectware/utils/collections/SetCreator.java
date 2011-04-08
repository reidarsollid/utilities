package no.itera.objectware.utils.collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 19.48
 */
public class SetCreator {
    private SetCreator() {
    }

    public static <E>Set<E> newSet(){
        return new HashSet<E>();
    }

    public static <E>SortedSet<E> newSortedSet(){
        return new TreeSet<E>();
    }

    public static <E>HashSet<E> newHashSet(){
        return new HashSet<E>();
    }

    public static <E> TreeSet<E> newTreeSet(){
        return new TreeSet<E>();
    }

    public static <E>LinkedHashSet<E> newLinkedHashSet(){
        return new LinkedHashSet<E>();
    }

    public static <E>ConcurrentSkipListSet<E> newConcurrentSkipListSet(){
        return new ConcurrentSkipListSet<E>();
    }

    public static <E>CopyOnWriteArraySet<E> newCopyOnWriteArraySet(){
        return new CopyOnWriteArraySet<E>();
    }

}
