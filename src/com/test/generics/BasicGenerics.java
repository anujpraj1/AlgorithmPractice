package com.test.generics;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;

class Printer
{
    <T> void printArray(T[] array) {
        Iterator<T> it = Arrays.stream(array).iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}

public class BasicGenerics {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
