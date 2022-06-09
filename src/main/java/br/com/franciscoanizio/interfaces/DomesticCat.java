package br.com.franciscoanizio.interfaces;

import br.com.franciscoanizio.polymorphism.Cat;

public class DomesticCat extends Cat implements DomesticPet
{

    public DomesticCat(String name, String breed, int kilogrammes, String color) {
        super(name, breed, kilogrammes, color);
    }

    @Override
    public void trick()
    {
        DomesticPet.heartBeat();
        System.out.println("Scratch");
        System.out.println("Scratch");
        System.out.println("Scratch");
        System.out.println("Scratch");
    }

    @Override
    public void feed()
    {
        DomesticPet.heartBeat();
        System.out.println("Drink milk !");

    }
}
