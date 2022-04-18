package com.Java8.FunctionalInterface;

//Functional Interface is an interface which contains only one abstract methods.
//Lambda Expression is use to represent instance of Functional Interface.

@FunctionalInterface
interface Square
{
    int calculate(int x);

}

public class Demo {


    public static void main(String[] args) {


        int a = 4;
        Square s = (int x) -> x * x;

        int result = s.calculate(a);
        System.out.println("Square of number = " + result);
    }
}
