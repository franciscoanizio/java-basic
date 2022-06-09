package br.com.franciscoanizio.interfaces;

import br.com.franciscoanizio.polymorphism.Cat;

public class TestInterface
{
    public static void main(String[] args)
    {
        DomesticCat cat = new DomesticCat("Garfield","Tabby",4,"Orange Tabby");
        cat.feed();
        cat.trick();
    }
}
