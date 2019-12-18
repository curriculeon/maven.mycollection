package com.github.curriculeon;
import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType>{
    private MyArrayList<KeyValue<KeyType,ValueType>> newMap;
    public MyMap() {
        newMap = new MyArrayList<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        for (int i=0; i< entries.size(); i++) {
            KeyValue<KeyType, ValueType> pair = entries.get(i);
                this.put(pair.getKey(), pair.getValue());
        }
    }

    @Override
    public void put(KeyType key, ValueType value) {
        this.newMap.add(new KeyValue<>(key, value));
    }

    @Override
    public ValueType get(KeyType key) {
        ValueType valuething = null;
        KeyType keything;
        for (int i=0; i< newMap.size(); i++) {
            KeyValue<KeyType, ValueType> pair = newMap.get(i);
            keything = pair.getKey();
            if(keything == key) {
                valuething = pair.getValue();
            }
        }
        return valuething;
    }

    @Override
    public Set<KeyType> getKeySet() {
        Set<KeyType> keything = null;
        for (int i=0; i< newMap.size(); i++) {
            KeyValue<KeyType, ValueType> pair = newMap.get(i);
            keything= (Set<KeyType>)pair.getKey();
        }
        return keything;
    }

    @Override
    public List<ValueType> getValues() {
        List<ValueType> valuething = null;
        for (int i=0; i< newMap.size(); i++) {
            KeyValue<KeyType, ValueType> pair = newMap.get(i);
            valuething= (List<ValueType>)pair.getValue();
        }
        return valuething;
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getKeyValues() {
        Set<KeyValue<KeyType,ValueType>> newSet = null;
        for(int i=0; i< newMap.size(); i++) {
            KeyValue<KeyType, ValueType> pair = newMap.get(i);
            newSet.add(pair);
        }
        return newSet;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
