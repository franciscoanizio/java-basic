package br.com.franciscoanizio.polymorphism;

public class Pet
{

    /************************************************************************
    * Polymorphism is the ability of an object to take on many forms.       *
    * The most common use of polymorphism in OOP occurs when a              *
    * parent class reference is used to refer to a child class object.      *
    * Any Java object that can pass more than one IS-A test is considered   *
    * to be polymorphic.                                                    *
    ************************************************************************/
    protected String name;
    protected String breed;
    protected int kilogrammes;
    protected String color;

    public Pet(String name,String breed,int kilogrammes,String color)
    {
        this.name = name;
        this.breed = breed;
        this.kilogrammes = kilogrammes;
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Pet [ name = "+name+", breed = "+this.breed+", kilogrammes = "+this.kilogrammes+", color = "+color+" ];";
    }

    public String getName()
    {
        return this.name;
    }
}
