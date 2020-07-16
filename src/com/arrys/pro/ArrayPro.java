package com.arrys.pro;

import java.util.Arrays;

public class ArrayPro {
	public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int[] num = {10, 20 ,30};
        System.out.println(Arrays.toString(num));
        int sum = 0;
        Double average;
     
        // for each loop is used to access elements 
        for (int number: numbers) {
            sum += number;
        }
     
        int arrayLength = numbers.length;

        // Change sum and arrayLength to double as average is in double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        int[] age = new int[5];

        // insert 14 to third element
        age[2] = 14;

        // insert 34 to first element
        age[0] = 34;

        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i +": " + age[i]);
        }
}
}

