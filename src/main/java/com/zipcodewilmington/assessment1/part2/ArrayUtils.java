package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer numberOfOccurrences = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                numberOfOccurrences ++;
            }
        }
        return numberOfOccurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> arrList = new ArrayList<>(Arrays.asList(objectArray));
        arrList.remove(objectToRemove);
        Object[] valueRemoved = new Object[arrList.size()];
        valueRemoved = arrList.toArray(valueRemoved);
        return valueRemoved;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < objectArray.length; i++) {
            frequencies.put(objectArray[i], getNumberOfOccurrences(objectArray, objectArray[i]));
        }
        Map.Entry<Object, Integer> entry = frequencies.entrySet().iterator().next();
        Integer mostFrequent = entry.getValue();
        Object mostCommon = null;
        for (Map.Entry<Object, Integer> current: frequencies.entrySet()) {
            if (entry.getValue() > mostFrequent) {
                mostCommon = entry.getKey();
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> arrList = new ArrayList<Object>();
        for (int i = 0; i < objectArray.length; i++) {
            arrList.add(objectArray[i]);
        }
        for (int j = 0; j < objectArrayToAdd.length; j++) {
            arrList.add(objectArrayToAdd[j]);
        }
        Object[] mergedArrays = arrList.toArray();
        return mergedArrays;
    }
}
