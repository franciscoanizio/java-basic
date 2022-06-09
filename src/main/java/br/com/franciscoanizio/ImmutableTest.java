package br.com.franciscoanizio;

import java.util.*;

public class ImmutableTest
{

    public ImmutableTest()
    {

        // List could have same objects in it !
        listWord.add("Apple");
        listWord.add("Apple");
        listWord.add("Pineapple");
        listWord.add("Watermelon");

        //
        setNumber.add(1);
        setNumber.add(10);
        setNumber.add(100);
        setNumber.add(1000);
        setNumber.add(10000);
        setNumber.add(100000);

        // From here don't throws excption but not is happening
        // Because set can't contain the same elements in it
        setNumber.add(100);
        setNumber.add(100);
        setNumber.add(100);
        setNumber.add(100);

    }

    public List<String> getListWord()
    {
        return Collections.unmodifiableList(listWord);
    }

    public Set<Integer> getListNumber() {
        return Collections.unmodifiableSet(setNumber);
    }

    private List<String> listWord = new ArrayList<String>();
    private Set<Integer> setNumber = new HashSet<Integer>();


    public static void main(String[] args)
    {
        ImmutableTest immutableTest = new ImmutableTest();

        List<String> referenceLst = immutableTest.getListWord();
        List<String> instanceLst = new ArrayList<>(immutableTest.getListWord());

        Set<Integer> referenceNumbers = immutableTest.getListNumber();
        Set<Integer> instanceSet = new HashSet<Integer>(immutableTest.getListNumber());

        try
        {
            // we cannot manipulate this object because it's unmodifiable
            // so we expect the excpetion UnsupportedOperationException
            referenceLst.add("Grape");
        }
        catch (UnsupportedOperationException e)
        {
            e.printStackTrace();
        }
        instanceLst.add("Grape");

        try
        {
            // we cannot manipulate this object because it's unmodifiable
            // so we expect the excpetion UnsupportedOperationException
            referenceNumbers.add(10000000);
        }
        catch (UnsupportedOperationException e)
        {
            e.printStackTrace();
        }
        instanceSet.add(10000000);

        System.out.println("reference of List : "+referenceLst);
        System.out.println("new instance of List : "+instanceLst);
        System.out.println("reference of Set : "+referenceLst);
        System.out.println("Instance of Numbers : "+instanceSet);



    }

}
