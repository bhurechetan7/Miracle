package com.Java8.CollectorsClass;

import java.util.List;
import java.util.stream.Collectors;

import static com.Java8.CollectorsClass.City.prepareTemperature;

public class Demo {

    public static void main(String[] args)
    {

        // The following statement filters
        // cities having temp > 10
        // The map function transforms only
        // the names of the cities
        // The collect function collects the
        // output as a List
    List<String> list = prepareTemperature().stream()
                .filter(f -> f.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.toList());

        System.out.println(list);
    }

}