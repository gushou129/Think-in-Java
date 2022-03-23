package com.company.initialization;

public class test {
    public static void main(String[] args) throws InterruptedException {
        for (MyEnum m :
                MyEnum.values()) {
            System.out.println(m + " , and its ordinal " + m.ordinal());
        }
    }
}
