package com.github.curriculeon;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MyMap<KeyType, ValueType> implements MyMapInterface{
    private Map<KeyType, ValueType> map = new HashMap<>();
    public MyMap() {
    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        for (KeyValue<KeyType, ValueType> entry : entries) map.put(entry.getKey(), entry.getValue());
    }

    @Override
    public void put(Object key, Object value) {
        map.put((KeyType)key, (ValueType)value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    @Override
    public Set getKeySet() {
        Set<KeyType> set = new HashSet<>();

        map.forEach((k, v) -> {set.add((KeyType) k);});

        return set;
    }

    @Override
    public List getValues() {
        List<ValueType> list = new ArrayList<>();

        map.forEach((k, v) -> {list.add((ValueType) v);});

        return list;
    }

    @Override
    public Set<KeyValue> getKeyValues() {
        KeyValue keyValue = new KeyValue();
        Set<KeyValue> set = new HashSet<>();

        map.forEach((k, v) ->
        {
            keyValue.setKey(k);
            keyValue.setValue(v);
            set.add(keyValue);
        });

        return set;
    }

    @Override
    public MyMapInterface invert() {
        Map<ValueType, KeyType> tempMap = new HashMap<>();
        MyMapInterface<KeyType, ValueType> myMapInterface = (MyMapInterface)tempMap;
        map.forEach((k, v) ->
        {
            tempMap.put(v, k);

        });
        return myMapInterface;
    }
}
