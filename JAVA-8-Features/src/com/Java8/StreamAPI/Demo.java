package com.Java8.StreamAPI;

/*Stream API is used to process collections of objects.
 A stream is a sequence of objects that supports various methods
 which can be pipelined to produce the desired result*/

import java.util.*;
import java.util.stream.*;

public class Demo {

    public static void main(String[] args) {

        //Lets Understand Stream Creation

        //Empty Stream
        Stream<String> streamEmpty = Stream.empty();

        //Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        //Stream of array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        //From existing Array
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        //Stream generate method
        //The generate() method accepts a Supplier<T> for element generation.
        // As the resulting stream is infinite, the developer should specify the desired size,
        // or the generate() method will work until it reaches the memory limit:

        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

        // Another way to create infinite stream is using iterate
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        // Stream Of primitive
        // Java 8 offers the possibility to create streams out of three primitive types: int, long and double
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        //Since Java 8, the Random class provides a wide range of methods for generating streams of primitives.
        // For example, the following code creates a DoubleStream, which has three elements:
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        //Stream of String
        //We can also use String as a source for creating a stream with the
        // help of the chars() method of the String class.
        // Since there is no interface for CharStream in JDK, we use the IntStream to represent a stream of chars instead.
        IntStream streamOfChars = "abc".chars();


         List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);

         //  lets find the even number from list of number using stream, filter is the intermediate operation
        //  and collect is the terminal operation
             List<Integer> evenNumber =  numList.stream().filter(a-> a%2==0).collect(Collectors.toList());
        System.out.println("List of Even Number = " + evenNumber);

        // using map operation, The map method is used to returns a stream consisting of the results of applying
        // the given function to the elements of this stream.

       List<Integer> SquareOfNumber = numList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(" List of square number = " + SquareOfNumber);

        //Sorting of element
              List<Integer> sorteeList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedList = " + sorteeList);

        // reduce terminal operation

          int result    =    numList.stream().filter(x-> x%2 !=0).reduce(0,(s,i)->s + i);
        System.out.println("Result = " + result);


          //Collect a stream into array

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);

        //Lets Underdtand Intermediate operation

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);

        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Terminal Operation

         // Stream.forEach()
        memberNames.forEach(System.out::println);
           //Stream.collect()

        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);

             //Stream.match()

        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //true

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //false

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);     //false

           //stream.count()

        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

        System.out.println(totalMatched);     //2

         //stream.reduce()
        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

        // Few of the Short circuit operation
          // Stream.anyMatch()
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matched);    //true

        //Stream.findFirst()

        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst()
                .get();

        System.out.println(firstMatchedName);    //Lokesh



    }

}
