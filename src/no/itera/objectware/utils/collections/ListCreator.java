package no.itera.objectware.utils.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * User: Reidar Sollid
 * Date: 08.04.11
 * Time: 15.43
 */
public class ListCreator {
    private ListCreator() {

    }

    public static <E> List<E> newList() {
        return new ArrayList<E>();
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<E>();
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<E>();
    }
}
