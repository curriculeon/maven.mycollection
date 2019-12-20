package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

public class KeyValue<KeyType, ValueType> {

    KeyType key;
    ValueType value;

    public KeyValue() {}

    public KeyValue(KeyType key, ValueType value) {
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return key;
    }

    public ValueType getValue() {
        return value;
    }

    public void setKey(KeyType key) {this.key = key;}

    public void setValue(ValueType value) {this.value = value;}
}
