package com.github.curriculeon.myset;

import com.github.curriculeon.MyArrayList;
import com.github.curriculeon.MyCollectionInterface;
import com.github.curriculeon.MySet;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leonhunter
 * @created 12/15/2019 - 8:20 PM
 */
@SuppressWarnings("all")
public class RemoveByIndex {
    //given
    private <SomeType> void test(int indexOfElementToRemove, SomeType[] valuesToBePopulatedWith, SomeType[] expectedElementSequence) {
        MySet<SomeType> myList = new MySet<>(valuesToBePopulatedWith);
        MyCollectionInterface<SomeType> myCollection = (MyCollectionInterface<SomeType>) myList;

        // given elements have been added to collection
        /*for (SomeType someValue : valuesToBePopulatedWith) {
            myCollection.add(someValue);
            Boolean myCollectionContainsValue = myCollection.contains(someValue);
            Assert.assertTrue(myCollectionContainsValue);
        }*/
        Integer preRemoveLength = myCollection.size(); // get size of collection
       // Integer expectedPreRemoveLength = valuesToBePopulatedWith.length;
       // Assert.assertEquals(expectedPreRemoveLength, preRemoveLength); // ensure length is correct before removal

        // when
        Integer expectedPostRemoveLength; // get the expected post-removal length
        if (indexOfElementToRemove < myCollection.size()) {
            expectedPostRemoveLength = preRemoveLength - 1;// when requested to remove in the range of collection size
        } else {
            expectedPostRemoveLength = preRemoveLength; // no deletion when tried to remove out of the index of the collection
        }
        myCollection.remove(indexOfElementToRemove);
        Integer actualPostRemoveLength = myCollection.size(); // get size of collection
      //  Integer actualPostRemoveLength = postRemoveLength; // get the actual post-removal length
        Assert.assertEquals(expectedPostRemoveLength, actualPostRemoveLength);
System.out.println(expectedPostRemoveLength);
        // then
        for (int currentIndex = 0; currentIndex < expectedElementSequence.length; currentIndex++) {
            SomeType expectedElement = expectedElementSequence[currentIndex];
            SomeType actualElement = myCollection.get(currentIndex);
            System.out.println(expectedElement+" "+actualElement);

            //System.out.println(expectedElement+" "+ actualElement);
            Assert.assertEquals(expectedElement, actualElement);
        }
    }


    @Test
    public void test0() {
        String[] valuesToPopulateCollection = new String[]{"The", "Quick", "Brown", "Fox"};
        String[] expectedElementSequence = new String[]{"The", "Brown", "Fox"};
        int indexOfElementToRemove = 1;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }


    @Test
    public void test1() {
        Integer[] valuesToPopulateCollection = new Integer[]{1,3,5,8,13};
        Integer[] expectedElementSequence = new Integer[]{3,5,8,13};
        int indexOfElementToRemove = 0;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }

    @Test
    public void test2() {
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        Date[] valuesToPopulateCollection = new Date[]{d1,d2,d3};
        Date[] expectedElementSequence = new Date[]{d1};
        int indexOfElementToRemove = 2;
        test(indexOfElementToRemove, valuesToPopulateCollection, expectedElementSequence);
    }
}
