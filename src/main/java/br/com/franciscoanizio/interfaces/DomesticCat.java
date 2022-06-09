package br.com.franciscoanizio.interfaces;

import br.com.franciscoanizio.polymorphism.Cat;
import br.com.franciscoanizio.polymorphism.Pet;

public class DomesticCat extends Cat implements DomesticPet
{

    public DomesticCat(String name, String breed, int kilogrammes, String color) {
        super(name, breed, kilogrammes, color);
    }

    @Override
    public void trick(Pet p)
    {
        DomesticPet.heartBeat(p,"trick");

            System.out.println(p.getName() + " Scratch");
            DomesticPet.breath();
            System.out.println(p.getName() + " Hiking");
            DomesticPet.breath();
            System.out.println(p.getName() + " Scratch");
            DomesticPet.breath();
            System.out.println(p.getName() + " Scratch");

    }

    @Override
    public void feed(Pet p)
    {
        DomesticPet.heartBeat(p,"feed");

        System.out.println(p.getName() + "Drink milk !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");

        System.out.println(p.getName() + "Drink milk !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Drinking ... !");
        DomesticPet.breath();

        System.out.println(p.getName() + "Eat food !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Eating ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Eating ... !");
        DomesticPet.breath();
        System.out.println(p.getName() + "Eating ... !");
        DomesticPet.breath();

    }
}
