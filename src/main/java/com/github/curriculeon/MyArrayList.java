package com.github.curriculeon;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {
    private SomeType [] list;
    private int size=0;
    private static final int DEFOULT_SIZE=1;

    public MyArrayList() {
    list=(SomeType[])new Object[DEFOULT_SIZE];
    size=0;
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        this.list=valuesToBePopulatedWith;
        this.size=valuesToBePopulatedWith.length;
    }

    private SomeType[] copy(SomeType[] copy, int size){
        SomeType [] result;
        result = (SomeType[])new Object[size];
        for(int i=0; i<copy.length;i++){
            result[i]=copy[i];
        }
        return result;
    }
    @Override
    public void add(SomeType objectToAdd) {
        int newSize=0;
        Object [] newList;
        if (this.size!=0){

            newSize=size()+1;
            newList=copy(this.list,newSize);
            newList[newSize-1]=objectToAdd;
        }
        else{
            newList= new Object[]{objectToAdd};
        }
        this.size=newList.length;
        this.list=(SomeType[])newList;

    }

    @Override
    public void remove(SomeType objectToRemove) {
        int newSize=size()-1;
        SomeType [] newList=(SomeType[])new Object[newSize];
        int j=0;
        if (this.contains(objectToRemove)){
           for(int index=0; index<=newSize; index++){
             if (this.list[index]!=objectToRemove ){
                newList[j]=list[index];
                j++;
             }
           }
        }
        this.list=(SomeType[])newList;
        this.size=newSize;
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        SomeType objToRemove=this.list[indexOfObjectToRemove];
    if (indexOfObjectToRemove<size()){
        remove(objToRemove);
    }
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.list[indexOfElement];
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        for(int index=0; index<this.list.length; index++){
            if (this.list[index]==objectToCheckFor ){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer size() {
        return this.size;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return new MyArrayListIterator(this);
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }
}
