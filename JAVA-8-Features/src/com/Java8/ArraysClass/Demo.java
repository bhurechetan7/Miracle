package com.Java8.ArraysClass;

/*The Arrays class in java.util package is a part of the Java Collection Framework.
        This class provides static methods to dynamically create and access Java arrays.
        It consists of only static methods and the methods of Object class.
        The methods of this class can be used by the class name itself.*/

/*Few useful methods are : Arrays.asList(): Returns a fixed-size list backed by the specified Arrays
    Arrays.binarySearch() :Searches for the specified element in the array with the help of
                            the Binary Search Algorithm

  Arrays.compare(array 1, array 2):	Compares two arrays passed as parameters lexicographically.

  Arrays.equals(array1, array2):	Checks if both the arrays are equal or not.
  Arrays.hashCode(originalArray): 	Returns an integer hashCode of this array instance
   Arrays.mismatch(array1, array2): Finds and returns the index of the first unmatched element
                                      between the two specified arrays.
   Arrays.sort(originalArray)	Sorts the complete array in ascending order.
   Arrays.stream(originalArray) 	Returns a sequential stream with the specified array as its source.*/

import java.util.Arrays;

public class Demo {

// Java Program to Demonstrate Arrays Class
// Via asList() method

        public static void main(String[] args)
        {
            // Get the Array
            int intArr[] = { 10, 20, 15, 22, 35 };

            // To convert the elements as List
            System.out.println("Integer Array as List: "
                    + Arrays.asList(intArr));


            // Get the Array
            int arr[] = { 10, 20, 15, 22, 35 };

            Arrays.sort(arr);

            int intKey = 22;

            // Print the key and corresponding index
            System.out.println(
                    intKey + " found at index = "
                            + Arrays.binarySearch(intArr, intKey));


            // Java program to demonstrate
             // Arrays.compare() method

            // Get the Array
            int arr1[] = { 10, 20, 15, 22, 35 };

            // Get the second Array
            int arr2[] = { 10, 15, 22 };

            // To compare both arrays
       //     System.out.println("Integer Arrays on comparison: "
               //     + Arrays.compare(arr1, arr2));

                    //Equals string

            // Get the Arrays
            int  num[] = { 10, 20, 15, 22, 35 };

            // Get the second Arrays
            int num1[] = { 10, 15, 22 };

            // To compare both arrays
            System.out.println("Integer Arrays on comparison: "
                    + Arrays.equals(num, num1));

              // fill array

            int arr3[] = { 10, 20, 15, 22, 35 };

            int Key = 22;

            Arrays.fill(intArr, Key);

            // To fill the arrays
            System.out.println("Integer Array on filling: "
                    + Arrays.toString(arr3));


              //sorting array

            // Get the Array
            int arr4[] = { 10, 20, 15, 22, 35 };

            // To sort the array using normal sort-
            Arrays.sort(arr4);

            System.out.println("Integer Array: "
                    + Arrays.toString(arr4));


            // Get the Array
            int arr5[] = { 10, 20, 15, 22, 35 };

            // To sort the array using normal sort
            Arrays.sort(arr5, 1, 3);

            System.out.println("Integer Array: "
                    + Arrays.toString(arr5));

                 //Arrays.toString()
            // Get the Array
            int arr6[] = { 10, 20, 15, 22, 35 };

            // To print the elements in one line
            System.out.println("Integer Array: "
                    + Arrays.toString(arr6));


        }
    }




