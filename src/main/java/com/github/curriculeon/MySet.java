package com.github.curriculeon;


import java.util.*;

public class MySet<SomeType> implements MyCollectionInterface{
    private Set<SomeType> mySet;
    public MySet() {
        mySet = new LinkedHashSet<>();
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        mySet = new LinkedHashSet<>();

        for (SomeType item : valuesToBePopulatedWith) {
            mySet.add(item);
        }
    }

    @Override
    public void add(Object objectToAdd) {
        mySet.add((SomeType) objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        mySet.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        if (indexOfObjectToRemove < mySet.size()) { // if indexOfObjectToRemvoe is greater than size, no deletion
            int currentIndex = 0;
            Iterator itr = mySet.iterator();
            while (itr.hasNext()) {
                itr.next();
                if (currentIndex == indexOfObjectToRemove) {
                    itr.remove();
                    break;
                }
                currentIndex++;
            }
        }
    }

    @Override
    public Object get(int indexOfElement) {
        Iterator<SomeType> itr = mySet.iterator();
        int currentIndex=0;

        while (itr.hasNext()) {
            if (currentIndex == indexOfElement) {
                return itr.next();
            }
            itr.next();
            currentIndex++;
        }
        return null;
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return mySet.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return mySet.size();
    }

    @Override
    public Iterator iterator() {
        return mySet.iterator();
    }
}
