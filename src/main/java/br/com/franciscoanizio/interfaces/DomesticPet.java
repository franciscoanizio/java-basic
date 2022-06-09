package br.com.franciscoanizio.interfaces;

public interface DomesticPet
{
    public static String heartBeatPattern = "heart beat : v^√√v^──√v^√v^──√v^√√v^──";

    public void trick();
    public void feed();

    static void heartBeat()
    {
        new Thread(
                () ->{
                    for(int x=0;x<10;x++)
                    {
                        System.out.println(heartBeatPattern);

                        try
                        {
                            Thread.sleep(2*1000);
                        }
                        catch (InterruptedException e)
                        {
                            throw new RuntimeException(e);
                        }
                    }
                }
        ).start();
    }
}