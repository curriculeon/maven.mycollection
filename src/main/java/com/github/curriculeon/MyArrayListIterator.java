package com.github.curriculeon;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyArrayListIterator<SomeType> implements Iterator<SomeType> {
    private  final MyArrayList<SomeType> myList;
    private int current;
    public MyArrayListIterator(MyArrayList<SomeType> myArrayList) {
        this.myList = myArrayList;
        this.current=0;
    }

    @Override
    public boolean hasNext() {

            return current<myList.size();

    }

    @Override
    public SomeType next() {
        if(hasNext()){
            SomeType result = this.myList.get(current);
            current++;
            return result;
        }
        return null;
    }

    @Override
    public void remove() {
        myList.remove(current);
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
