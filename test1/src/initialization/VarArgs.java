//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.

package initialization;

class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for(Object obj : args)
            System.out.printf(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(new Object[]{"one", "two", "there"});
        printArray(new Object[]{new A(), new A(), new A()});

    }
}   /* Output: (Sample)
47 3.14.11.11
one two three
initialization.A@2f4d3709 initialization.A@4e50df2e initialization.A@1d81eb93
*///:~
