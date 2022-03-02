//: com.company.operators/Dog.java
// test5
package com.company.operators;

class Dog {
    String name;
    String says;

    public void printName(){
        System.out.println(name);
    }
    public void printSays(){
        System.out.println(says);
    }
}
public class EqualsMethod2 {
    public void main(){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "wurf!";
        d3.name = "spot";
        d3.says = "Ruff!";

        d1.printName();
        d1.printSays();
        d2.printName();
        d2.printSays();

        System.out.println("d1.name == d3.name: " + d1.name.equals(d3.name));
        System.out.println("d1.says == d3.says: " + d1.says.equals(d3.says));
        System.out.println("d1 == d3: " + d1.equals(d3));
    }
}   /* Output:
spot
Ruff!
scruffy
wurf!
*///:~