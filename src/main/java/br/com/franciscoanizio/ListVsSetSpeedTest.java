package br.com.franciscoanizio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListVsSetSpeedTest
{


    public static void main(String[] args)
    {
        new Thread( () -> {
            testArrayList();
        }).start();

        new Thread( () -> {
            testHashSet();
        }).start();
    }




    public static void testArrayList()
    {
        Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 200000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("ArrayList time elapsed: " + tempoDeExecucao);
    }

    public static void testHashSet()
    {
        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 200000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("HashSet time elapsed : " + tempoDeExecucao);
    }
}
