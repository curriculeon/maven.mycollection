package com.github.curriculeon;

public interface MyCollectionInterface<SomeType> extends Iterable<SomeType> {
    void add(SomeType objectToAdd);
    void remove(SomeType objectToRemove);
    void remove(int indexOfObjectToRemove);
    SomeType get(int indexOfElement) throws Exception;
    Boolean contains(SomeType objectToCheckFor);
    Integer size();
}
