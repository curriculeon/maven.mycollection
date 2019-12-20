package com.github.curriculeon;

import java.util.*;

public class MySet<SomeType> implements MyCollectionInterface, Iterable{
    private Set<SomeType> set = new LinkedHashSet<>();
    public MySet() {
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        Collections.addAll(set, valuesToBePopulatedWith);
    }

    @Override
    public void add(Object objectToAdd) {
        set.add((SomeType)objectToAdd);
    }

    @Override
    public void remove(Object objectToRemove) {
        set.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {

        Iterator iterator = set.iterator();
        int counter = 0;
          while (iterator.hasNext()){
            if (counter == indexOfObjectToRemove) {
                remove(iterator.next());
                break;
            }
            iterator.next();
            counter++;
          }
    }

    @Override
    public Object get(int indexOfElement) throws Exception {
        Object result = null;
        boolean finished = false;
        Iterator iterator = set.iterator();

        int counter = 0;
        while (iterator.hasNext() && (counter <= indexOfElement))
        {
                result = iterator.next();
                finished = true;
                counter++;
        }
        if (!finished) {
            throw new Exception("index out of bounds");
        }
        return result;
    }

    @Override
    public Boolean contains(Object objectToCheckFor) {
        return set.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return set.size();
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = set.iterator();
        return iterator;
    }
}