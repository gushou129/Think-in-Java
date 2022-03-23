package com.company;

public class Main {

    public static < E > void printArray( E[] inputArray ) {
        // print array->Elements
        for( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1,2,3,4,5,6,8 };
        Double[] doubleArray = { 1.2,2.2,3.3,4.4,5.5,6.6 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Integer array: " );
        printArray(intArray);

        System.out.println("Double array: ");
        printArray(doubleArray);

        System.out.println("Char array: ");
        printArray(charArray);
    }
}
