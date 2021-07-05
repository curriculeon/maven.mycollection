package com.github.curriculeon;

public class KeyValue<KeyType, ValueType> {
    private KeyType key;
    private ValueType value;

    public KeyValue(KeyType key, ValueType value) {
        this.key = key;
        this.value = value;
    }

    public KeyType getKey() {
        return this.key;
    }

    public ValueType getValue() {
        return value;
    }

    public void setKey(KeyType key) {
        this.key = key;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
