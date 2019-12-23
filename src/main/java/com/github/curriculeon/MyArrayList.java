package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<SomeType> implements MyCollectionInterface {
    private List<SomeType> myArrayList;
    public MyArrayList() {
        myArrayList=new ArrayList<SomeType>();
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        myArrayList=new ArrayList<>();
        for (SomeType item : valuesToBePopulatedWith) {
            myArrayList.add(item);
        }
    }

    @Override
    public void add(Object objectToAdd) {
        myArrayList.add((SomeType) objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        myArrayList.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        myArrayList.remove(indexOfObjectToRemove);
    }

    @Override
    public Object get(int indexOfElement) {
        return myArrayList.get(indexOfElement);
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return myArrayList.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return myArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return myArrayList.listIterator();
    }
}
