//: com.company.initialization/VarargType.java

package com.company.initialization;

public class OptionalTrailingArguments {
    static void f (int required, String... trailing){
        System.out.printf("required: " + required + " ");
        for(String s : trailing)
            System.out.printf(s + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }
}   /* Output:
required: 1 one
required: 2 two three
required: 0
*///:~
