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
public class GetTest {
    //given
    private <SomeType> void test(SomeType... valuesToBePopulatedWith) {
        MySet<SomeType> myList = new MySet<>(valuesToBePopulatedWith);
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        for (int currentIndex = 0; currentIndex < valuesToBePopulatedWith.length; currentIndex++) {
            SomeType expected = valuesToBePopulatedWith[currentIndex];
            myCollection.add(expected);
            Boolean hasBeenAdded = myCollection.contains(expected);
            Assert.assertTrue(hasBeenAdded);

            // when
            SomeType actual = myCollection.get(currentIndex);

            // then
            Assert.assertEquals(expected, actual);
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
        test(new Object(), new Object(), new Object());
    }
}
