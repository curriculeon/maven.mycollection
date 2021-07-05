package com.github.curriculeon;

import java.util.List;
import java.util.Set;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType> {
    private MyArrayList<KeyValue<KeyType,ValueType>> list;

    public MyMap() {
        this.list = new MyArrayList<>();
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        KeyValue<KeyType, ValueType>[] array = new KeyValue[entries.size()];
        for (int i = 0; i < array.length; i++) {
            KeyValue<KeyType, ValueType> keyTypeValueTypeKeyValue = array[i];
            list.add(keyTypeValueTypeKeyValue);
        }
    }

    @Override
    public void put(KeyType key, ValueType value) {
        KeyValue<KeyType, ValueType> entry = new KeyValue<>(key, value);
        list.add(entry);
    }

    @Override
    public ValueType get(KeyType key) {
        // oh who wrote this method?
        // they were trash
        // ew stinky
        for (int currentIndex = 0; currentIndex < list.size(); currentIndex++) {
            KeyValue<KeyType, ValueType> currentEntry = list.get(currentIndex);
            KeyType currentKey = currentEntry.getKey();
            ValueType currentVal = currentEntry.getValue();

            if(currentKey.equals(key)) {
                return currentVal;
            }
        }
        return null;
    }

    @Override
    public Set<KeyType> getKeySet() {
        return null;
    }

    @Override
    public List<ValueType> getValues() {
        return null;
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getList() {
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
