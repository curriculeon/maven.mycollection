package com.github.curriculeon;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet<SomeType> implements MyCollectionInterface, Iterable{
    private Set<SomeType> set = new HashSet<>();
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
        if (iterator().hasNext()) do {
            if (counter == indexOfObjectToRemove)
                remove(iterator().next());
            counter++;
        } while (iterator().hasNext());


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