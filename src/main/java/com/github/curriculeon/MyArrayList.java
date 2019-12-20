package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<SomeType> implements MyCollectionInterface{
    List<SomeType> list = new ArrayList<>();
    public MyArrayList() {}

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        for(SomeType st: valuesToBePopulatedWith)
            list.add(st);
    }

    @Override
    public void add(Object objectToAdd) {
        list.add((SomeType) objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        list.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        list.remove(indexOfObjectToRemove);
    }

    @Override
    public Object get(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return list.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return list.size();
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
