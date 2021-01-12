package com.example.testjob.service.impl;

import com.example.testjob.service.WorkOnArrayService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class WorkOnArrayServiceImpl implements WorkOnArrayService {
    @Override
    public int[] generateArr() {
        int length = (int) Math.round(Math.random() * 19 + 1);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100) - 50);
        }

        return array;
    }

    @Override
    public int[] sortArr(int[] arr) {

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
