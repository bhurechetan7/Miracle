package com.Java8.OptionalClass;

//java8 introduce Optional Class, it is use to avoid nullPointerException or to avoid crash. It increases code
//readability. In addition to this, we can return default value for any null value.

import sun.misc.PostVMInitHook;

import java.util.Locale;
import java.util.Optional;

// without using optional class.
public class Demo {

    public static void main(String[] args) {

        String[]  str = new String[10];
        String  s = str[5].toUpperCase();
        System.out.println("String in UpperCase = " + s);

     //output Exception in thread "main" java.lang.NullPointerException

    }
}
  // using optional class
 class Demo1{

      public static void main(String[] args) {

           String str[] = new String[10];
                str[0] = "chetan ";
                str[1] = "Chiku";
                str[2] = "Bhure";
                str[5] = "Reyansh";
                str[9] = "Chiku";
                 Optional<String> checkValue = Optional.ofNullable(str[5]);
                   if(checkValue.isPresent()){

                       System.out.println(str[5].toUpperCase());
                   }
                   else{

                       System.out.println("Value is not present");
                   }

                        //output before adding values in string array "Value is not present"
                        // after adding values in string array  output is "REYANSH"
      }

}

 /*
    There are three static methods available in Optional Classes.
   Static methods
   empty() : it return empty optional instances
    ,of(T value): It return optional with specified non-null value
    ofNullable(T value) : it return empty optional if no value is present or it return present value.
   */

 class Demo2 {

     public static void main(String[] args) {

         String[] str = new String[5];
         str[4] = "Hello, Good Morning!";

         Optional<String>  s = Optional.empty();
         System.out.println(s);
         Optional<String> s1 = Optional.of(str[4]);
         System.out.println(s1);
         System.out.println(s1.get());

      }


 }