package com.github.curriculeon.myset;

import com.github.curriculeon.MyArrayList;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author leonhunter
 * @created 12/15/2019
 */
@SuppressWarnings("all")
public class GetTest {
    //given
    private <SomeType> void test(SomeType... valuesToBePopulatedWith) {
        ArrayList<SomeType> newValuesToBePopulateWith = new ArrayList<>();
        MySet<SomeType> myList = new MySet<>(valuesToBePopulatedWith);
        MyCollectionInterface<SomeType> myCollection = new MySet<>();

        for (int currentIndex = 0; currentIndex < valuesToBePopulatedWith.length; currentIndex++) {
            // remove testing of duplicate items from valuesToBePopulatedWith
            if (myCollection.contains(valuesToBePopulatedWith[currentIndex])) {
                currentIndex++;
            }
            else {
                //when
                SomeType expected = valuesToBePopulatedWith[currentIndex];
                myCollection.add(expected);
                Boolean hasBeenAdded = myCollection.contains(expected);
                Assert.assertTrue(hasBeenAdded);
                SomeType actual = myCollection.get(currentIndex);

                // then
                Assert.assertEquals(expected, actual);
            }


            // when


            // then
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
