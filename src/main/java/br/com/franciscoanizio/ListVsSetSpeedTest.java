package br.com.franciscoanizio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListVsSetSpeedTest
{
    public static void main(String[] args)
    {

        System.out.println("TIP : Set is unordered and contains different elements,\n");
        System.out.println("whereas the list is ordered and can contain the same elements in it\n");
        System.out.println("This is the main reason about the different speeds between Set and List\n\n\n\n");

        new Thread( () -> {
            testArrayList();
        }).start();

        new Thread( () -> {
            testHashSet();
        }).start();
    }

    public static void testArrayList()
    {
        Collection<Integer> numbers = new ArrayList<Integer>();

        long begin = System.currentTimeMillis();

        for (int i = 1; i <= 200000; i++) {
            numbers.add(i);
        }

        for (Integer numero : numbers) {
            numbers.contains(numero);
        }

        long end = System.currentTimeMillis();

        long elapsed = end - begin;

        System.out.println("ArrayList time elapsed: " + elapsed);
    }

    public static void testHashSet()
    {
        Collection<Integer> numbers = new HashSet<Integer>();

        long begin = System.currentTimeMillis();

        for (int i = 1; i <= 200000; i++) {
            numbers.add(i);
        }

        for (Integer numero : numbers) {
            numbers.contains(numero);
        }

        long end = System.currentTimeMillis();

        long elapsed = end - begin;

        System.out.println("HashSet time elapsed : " + elapsed);
    }
}
