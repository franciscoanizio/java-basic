package br.com.franciscoanizio.polymorphism;

public class TestPolymorphism
{
    public static void main(String[] args)
    {

        Pet genericPet = new Pet("Snowflake","west england terrier",8,"white");
        Pet dog = new Dog("Rex","Rottweiler",35,"black");
        Pet cat = new Cat("Fluffy","Munchkin",3,"white");

        System.out.println("Generic pet = "+genericPet);
        System.out.println("Dog = "+dog);
        System.out.println("Cat = "+cat);

    }
}
