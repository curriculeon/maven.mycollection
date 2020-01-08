package com.github.curriculeon;


import java.util.*;

public class MySet<SomeType> implements MyCollectionInterface<SomeType>{
    private MyCollectionInterface<SomeType> mySet;

    public MySet() {
        mySet = new MyArrayList<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        mySet = new MyArrayList<>();
        for(int i=0;i<valuesToBePopulatedWith.length;i++) {
            mySet.add(valuesToBePopulatedWith[i]);
        }
    }

    @Override
    public void add(SomeType objectToAdd) {
        if(!mySet.contains(objectToAdd)) {
            mySet.add(objectToAdd);
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        mySet.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        mySet.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return mySet.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return mySet.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return mySet.size();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return mySet.iterator();
    }
}
