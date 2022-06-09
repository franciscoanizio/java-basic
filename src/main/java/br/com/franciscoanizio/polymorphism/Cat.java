package br.com.franciscoanizio.polymorphism;

public class Cat extends Pet
{

    public Cat(String name, String breed, int kilogrammes, String color)
    {
        super(name, breed, kilogrammes, color);
    }

    @Override
    public String toString()
    {
        return "Cat [ name = "+this.name+", breed = "+this.breed+", kilogrammes = "+this.kilogrammes+", color = "+color+" ];";
    }
}
