package org.asurion;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDSAKnowledge {

    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;

        String[] array = {"apple", "banana", "orange"};
        List<String> list = new ArrayList<>(Arrays.asList(array));

        Integer[] iArray = {1,2,3,4,5};
        List<Integer> iArrayList = new ArrayList<Integer>(Arrays.asList(iArray));

        System.out.println(arr);
        int[] a2 = {1,2,3,4,5};
        System.out.println(a2[3]);
        for(int i : a2){
            System.out.println(i);
        }
        Integer[] integerArray = Arrays.stream(a2).boxed().toArray(Integer[]::new);
        List<Integer> arrList = new ArrayList<Integer>(List.of(integerArray));

        System.out.println("Now u will see the differece by Fetch and not merge it before");


    }


}
