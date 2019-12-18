package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<KeyValue<Integer, String> > entries =new ArrayList<>();
        entries.add(new KeyValue<>(1,"a"));
        entries.add(new KeyValue<>(2,"b"));
        entries.add(new KeyValue<>(3,"c"));
        MyMap myMap=new MyMap(entries);
        for (Object key:myMap.getKeySet()
             ) {
            System.out.println(key);
        }
        for (Object value:myMap.getValues()
        ) {
            System.out.println(value);
        }

    }
}
