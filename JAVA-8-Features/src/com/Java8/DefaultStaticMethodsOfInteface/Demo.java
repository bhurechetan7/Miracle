package com.Java8.DefaultStaticMethodsOfInteface;

/*Before Java 8 introduction, Interface use to have only abstract methods, and to provide method implementation,
a class need to implement it,
But from java 8 onwards, we can provide implementation to interface methods using default and static keywords.*/

    // A simple program to Test Interface default
// methods in java
    interface TestInterface
    {
        // abstract method
        public void square(int a);

        // default method
        default void show()
        {
            System.out.println("Default Method Executed");
        }
    }

    class TestClass implements TestInterface
    {
        // implementation of square abstract method
        public void square(int a)
        {
            System.out.println(a*a);
        }

        public static void main(String args[])
        {
            TestClass d = new TestClass();
            d.square(4);

            // default method executed
            d.show();
        }
    }



/// Static Method

// A simple Java program to TestClassnstrate static
// methods in java
interface staticInterface
{
    // abstract method
    public void square (int a);

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
}

class Demo implements staticInterface
{
    // Implementation of square abstract method
    public void square (int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);

        // Static method executed
        staticInterface.show();
    }
}
