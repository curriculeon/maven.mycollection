package com.github.curriculeon.myset;

import com.github.curriculeon.MyArrayList;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leonhunter
 * @created 12/15/2019
 */
@SuppressWarnings("all")
public class NonNullaryConstructor {
    //given
    private <SomeType> void test(SomeType... valuesToBePopulatedWith) {
        MySet<SomeType> myList = new MySet<>(valuesToBePopulatedWith);
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;
        for (SomeType someValue : valuesToBePopulatedWith) {
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);
        }
    }

    @Test
    public void test0() {
        test("The", "Quick", "Brown");
    }

    @Test
    public void test1() {
        test(1, 2, 3);
    }

    @Test
    public void test2() {
        test(new Date(), new Date(), new Date());
    }
}
