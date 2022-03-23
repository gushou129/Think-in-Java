package com.company.list;

public class StringCompareEmp {
    public static void main(String[] args) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        // compareTo
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}/* Output:
-32
0
0
*/
