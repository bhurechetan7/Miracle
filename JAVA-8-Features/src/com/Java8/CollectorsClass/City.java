package com.Java8.CollectorsClass;


// Collectors is a utility class. It contains bundle of utility functions. It mostly use with stream API
// as a terminal operation.


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {

    private String name;
    private double temperature;

    // Parameterized constructor to
    // initialize the city class
    public City(String name, double temperature)
    {
        this.name = name;
        this.temperature = temperature;
    }

    // Getters to get the name and
    // temperature
    public String getName()
    {
        return name;
    }

    public Double getTemperature()
    {
        return temperature;
    }

    // Overriding the toString method
    // to return the name and temperature
    @Override
    public String toString()
    {
        return name + " --> " + temperature;
    }


    static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));
        return cities;
    }


}

