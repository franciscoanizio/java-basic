package br.com.franciscoanizio.interfaces;

public class TestInterface
{
    public static void main(String[] args)
    {
        DomesticCat cat = new DomesticCat("Garfield","Tabby",4,"Orange Tabby");
        cat.feed(cat);
        cat.trick(cat);


    }
}
