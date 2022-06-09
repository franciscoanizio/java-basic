package br.com.franciscoanizio.polymorphism;

public class Dog extends Pet
{

    public Dog(String name, String breed, int kilogrammes, String color)
    {
        super(name, breed, kilogrammes, color);
    }

    @Override
    public String toString()
    {
        return "Dog [ name = "+this.name+", breed = "+this.breed+", kilogrammes = "+this.kilogrammes+", color = "+color+" ];";
    }
}
