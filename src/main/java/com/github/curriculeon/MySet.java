package com.github.curriculeon;

import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MySet<SomeType> implements MyCollectionInterface<SomeType> {
    private MyArrayList<SomeType> myArrayList;
    public MySet() {
        myArrayList=new MyArrayList<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
         myArrayList=populateSet(valuesToBePopulatedWith);
    }
    private MyArrayList populateSet(SomeType[] valuesToBePopulatedWith){
        MyArrayList arr=new MyArrayList<>();
        for (SomeType obj:valuesToBePopulatedWith
        ) {if(!arr.contains(obj))
            arr.add(obj);
        }
        return arr;
    }

    @Override
    public void add(SomeType objectToAdd) {
        if(!contains(objectToAdd)){
            System.out.println("Adding "+ objectToAdd);
            myArrayList.add(objectToAdd);
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        if(contains(objectToRemove)){
            myArrayList.remove(objectToRemove);
        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public SomeType get(int indexOfElement) {
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {

        boolean result=myArrayList.contains(objectToCheckFor);

        return result;
    }

    @Override
    public Integer size() {
        return myArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
