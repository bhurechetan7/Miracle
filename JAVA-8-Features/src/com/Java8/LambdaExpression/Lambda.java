package com.Java8.LambdaExpression;


/* Lamdba expression is use to implement functional interface
   Enable to treat functionality as a method argument, or code as data.
   A function that can be created without belonging to any class.
   A lambda expression can be passed around as if it was an object and executed on demand.*/

//If a Java interface contains one and only one abstract method then it is termed as functional interface.

@FunctionalInterface
interface MyInterface{
    // the single abstract method
    double getValue();
}


public class Lambda {




/*    Way to define Lambda Expression
         (parameter list) -> lambda body
       for example
    */
           double getPiValue() {
                 return 3.1415;
                      }

         /* We can write above method using lambda Expression
          ()-> 3.1415;*/


           //There are two types of Lambda Body in java
        //  Body with single expression
      // () -> System.out.println("Lamdas are superb");

         // Body that contain block of code
/*          () -> {
        double pi = 3.1415;
        return pi;
    };*/

          // Program in java using Lambda Expression.
/*           @FunctionalInterface
           interface MyInterface {

               //abstract method
                 double getPiValue();
           }

    public static void main(String[] args) {
              // declare the reference for interface
               MyInterface  mi ;

       mi = ()-> 3.143;
        System.out.println( "Value of Pi = " + mi.getPiValue);
    }*/

  //Lambda Expression with parameter

    //syntax  (n) ->(n%2)==0

      interface  ReverseString {

               String reverseString(String str);

      }

    public static void main(String[] args) {

             ReverseString rs = (str)->{
                                String s = "";
                                for(int i= str.length()-1; 1>0; i--){

                                    s += str.charAt(i);
                                    return s ;
                                }

             };

        System.out.println("Reverse of String  = " + rs.reverseString("Chetan"));

    }






}
