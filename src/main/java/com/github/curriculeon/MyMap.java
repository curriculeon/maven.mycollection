package com.github.curriculeon;


import java.util.*;

public class MyMap<KeyType, ValueType> implements MyMapInterface{
    MyArrayList<KeyValue<KeyType, ValueType>> myMap;
    public MyMap() {
        myMap = new MyArrayList<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        myMap = (MyArrayList<KeyValue<KeyType, ValueType>>) entries;
    }

    @Override
    public void put(Object key, Object value) {
        KeyValue<KeyType, ValueType> entry = new KeyValue((KeyType)key, (ValueType)value);
        myMap.add(entry);
    }

    @Override
    public Object get(Object key) {
        for (int i=0; i< myMap.size(); i++) {
            KeyValue<KeyType, ValueType> entry = myMap.get(i);
            if (entry.getKey().equals((KeyType)key)) {
                return (ValueType)entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Set getKeySet() {
        Set<KeyType> keyset = new LinkedHashSet<>();
        for (KeyValue<KeyType, ValueType> entry: myMap) {
            keyset.add(entry.getKey());
        }
        return keyset;
    }

    @Override
    public List getValues() {
        List<ValueType> valueset = new ArrayList<>();
        for (KeyValue<KeyType, ValueType> entry: myMap) {
            valueset.add(entry.getValue());
        }
        return valueset;
    }
    @Override
    public Set<KeyValue> getKeyValues() {
        Set<KeyValue> keyValueSet = new LinkedHashSet<>();
        for (KeyValue<KeyType, ValueType> entry: myMap) {
            keyValueSet.add(entry);
        }
        return keyValueSet;
    }

    @Override
    public MyMapInterface invert() {
        Map<ValueType, KeyType> invertMap = new LinkedHashMap<>();
        MyMapInterface<ValueType, KeyType> myMapInterface = (MyMapInterface)invertMap;

        for (KeyValue<KeyType, ValueType> entry: myMap) {
            myMapInterface.put(entry.getValue(), entry.getKey());
        }
        return myMapInterface;
    }
}
