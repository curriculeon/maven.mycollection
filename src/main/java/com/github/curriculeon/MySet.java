package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> implements MyCollectionInterface<SomeType> {
    private MyCollectionInterface<SomeType> list;
    public MySet() {
        this.list = new MyArrayList<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        this.list = new MyArrayList<>();
        for (int i = 0; i < valuesToBePopulatedWith.length; i++) {
            SomeType someType = valuesToBePopulatedWith[i];
            this.add(someType);
        }
    }

    @Override
    public void add(SomeType objectToAdd) {
        if(!list.contains(objectToAdd)) {
            list.add(objectToAdd);
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        this.list.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        this.list.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.list.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return this.list.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return this.list.size();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
