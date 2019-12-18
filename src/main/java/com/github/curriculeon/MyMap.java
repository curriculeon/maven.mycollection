package com.github.curriculeon;

import java.util.*;

public class  MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType> {
    private List<KeyValue<KeyType, ValueType>> arrayList;
    public MyMap() {
        this.arrayList=new ArrayList<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        this.arrayList=entries;

    }

    @Override
    public void put (KeyType key, ValueType value) {
        arrayList.add(new KeyValue<KeyType, ValueType>(key,value));
    }

    @Override
    public ValueType get(KeyType key) {
        for (KeyValue keyValue: arrayList
             ) {
            if (keyValue.getKey().equals(key)){
                return (ValueType) keyValue.getValue();
            }

        }
        return null;
    }

    @Override
    public Set<KeyType> getKeySet() {
        Set keySet=new HashSet();
        for (KeyValue keyValue:arrayList) {
            keySet.add(keyValue.getKey());
        }
        return keySet;
    }

    @Override
    public List<ValueType> getValues() {
        List valueList=new ArrayList();
        for (KeyValue keyValue:arrayList) {
            valueList.add(keyValue.getValue());
        }
        return valueList;
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getKeyValues() {
        Set keySet=new HashSet();
        for (KeyValue keyValue:arrayList) {
            keySet.add(keyValue);
        }
        return keySet;
    }

    @Override
    public MyMapInterface invert() {
        return null;
    }
}
