package br.com.franciscoanizio.interfaces;

import br.com.franciscoanizio.polymorphism.Pet;

public interface DomesticPet
{
    public static String heartBeatPattern = "heart beat : v^√√v^──√v^√v^──√v^√√v^──";

    public void trick(Pet p);
    public void feed(Pet p);

    static void heartBeat(Pet p,String action)
    {
        new Thread(
                () ->{
                    for(int x=0;x<10;x++)
                    {
                        System.out.println(p.getName()+" heart beat during  "+action+"ing  = "+heartBeatPattern);
                        try
                        {
                            Thread.sleep(500);
                        }
                        catch (InterruptedException e)
                        {
                            throw new RuntimeException(e);
                        }
                    }
                }
        ).start();
    }


    static void breath()
    {
        try
        {
            Thread.sleep(700);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}