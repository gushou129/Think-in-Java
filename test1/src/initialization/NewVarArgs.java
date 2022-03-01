//: initialization/NewVarArgs.java
// Using array syntax to create variable argument lists.

package initialization;

public class NewVarArgs {
    static void printArray(Object... args){
        for (Object obj : args)
            System.out.printf(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray(47, 3,14f,11,11);
        printArray(new A(), new A(), new A());
        // Or an array:
        printArray((Object[])new Integer[]{1, 2, 3, 4});
        printArray();   //Empty list is OK.
    }
}   /* Output: (75% match)
47 3.14 11.11
47 3 14.0 11 11
initialization.A@b4c966a initialization.A@2f4d3709 initialization.A@4e50df2e
1 2 3 4
*///:~
