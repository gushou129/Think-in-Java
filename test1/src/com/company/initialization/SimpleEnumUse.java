//: initalization/SimpleEnumeUse.java
package com.company.initialization;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.EMD;
        System.out.println(howHot);
        for (Spiciness s :
                Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }


    }
}
