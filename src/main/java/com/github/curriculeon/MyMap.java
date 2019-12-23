package com.github.curriculeon;


import java.util.*;

public class MyMap<KeyType, ValueType> implements MyMapInterface{
    Map<KeyType, ValueType> myMap;
    public MyMap() {
        myMap = new LinkedHashMap<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        myMap = new LinkedHashMap<>();
        for (KeyValue<KeyType, ValueType> map : entries) {
            myMap.put(map.getKey(), map.getValue());
        }
    }

    @Override
    public void put(Object key, Object value) {
        myMap.put((KeyType)key, (ValueType)value);
    }

    @Override
    public Object get(Object key) {
        return myMap.get((KeyType)key);
    }

    @Override
    public Set getKeySet() {
        return myMap.keySet();
    }

    @Override
    public List getValues() {
        return (List) myMap.values();
    }
    @Override
    public Set<KeyValue> getKeyValues() {
        return (Set)myMap.entrySet();
    }

    @Override
    public MyMapInterface invert() {
        Map<ValueType, KeyType> invertMap = new LinkedHashMap<>();
        MyMapInterface<ValueType, KeyType> myMapInterface = (MyMapInterface)invertMap;

        for (Map.Entry<KeyType, ValueType> entry : myMap.entrySet()) {
            myMapInterface.put(entry.getValue(), entry.getKey());
        }
        return myMapInterface;
    }
}
