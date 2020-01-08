package com.github.curriculeon;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.copyOfRange;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {
    private SomeType[] array;

    public MyArrayList() {
        this.array = (SomeType[]) new Object[0];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.array = valuesToBePopulatedWith;
    }

    @Override
    public void add(SomeType objectToAdd) {
        int newArraySize = array.length+1;
        Object[] newArray = copyOf(this.array, newArraySize);
        newArray[newArraySize-1] = objectToAdd;
        this.array = (SomeType[])newArray;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] == objectToRemove) {
                remove(currentIndex);
            }
        }
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        SomeType[] leftArray = copyOfRange(array, 0, indexOfObjectToRemove);
        SomeType[] rightArray = copyOfRange(array, indexOfObjectToRemove+1,array.length);
        SomeType[] newArray=(SomeType[]) new Object[array.length-1];

        System.arraycopy(leftArray, 0, newArray, 0, leftArray.length);
        System.arraycopy(rightArray, 0, newArray, leftArray.length, rightArray.length);
        this.array = newArray;
    }

    public SomeType get(int indexOfElement) {
        return this.array[indexOfElement];
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        for (int i=0;i<array.length;i++) {

            if (array[i].equals(objectToCheckFor)) {
                 return true;
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        return array.length;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return iterator();
    }
}
