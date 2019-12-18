package com.github.curriculeon;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{
    SomeType [] newArr;
    public MyArrayList() {
      newArr = (SomeType[])new Object[0];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.newArr = valuesToBePopulatedWith;
    }

    @Override
    public void add(SomeType objectToAdd){
        SomeType [] newAddArr = (SomeType[])new Object[newArr.length+1];
        System.arraycopy(newArr, 0, newAddArr, 0, newArr.length);
        newAddArr[newAddArr.length-1] = objectToAdd;
        newArr = newAddArr;
    }
    @Override
    public void remove(SomeType objectToRemove){
        SomeType [] newRemoveArr = (SomeType[])new Object[newArr.length-1];
        int j =0;
        for(int i=0; i<newArr.length; i++){
            if(newArr[i] != objectToRemove) {
                newRemoveArr[j] = newArr[i];
                j++;
            }
        }
        newArr=newRemoveArr;
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        SomeType [] newRemoveArr = (SomeType[])new Object[newArr.length-1];
        int j =0;
        for(int i=0; i < newArr.length; i++){
            if(i != indexOfObjectToRemove) {
                newRemoveArr[j] = newArr[i];
                j++;
            }
        }
        newArr = newRemoveArr;
    }

    @Override
    public SomeType get(int indexOfElement){
        return this.newArr[indexOfElement];
    }
    @Override
    public Boolean contains(SomeType objectToCheckFor){
        for(int i=0; i<newArr.length; i++){
            if(this.newArr[i] == objectToCheckFor) {
                return true;
            }
        }
        return false;
    }
    @Override
    public Integer size(){
        return this.newArr.length;
    }

    @Override
    public Iterator<SomeType> iterator() {
        Iterator<SomeType> newIteratorArr = (Iterator<SomeType>) Arrays.asList(newArr);
        return newIteratorArr;
    }
}
