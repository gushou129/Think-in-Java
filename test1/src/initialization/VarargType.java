//: initialization/VarargType.java

package initialization;

import java.util.Arrays;

public class VarargType {
    static void f (Character... args){
        System.out.printf(String.valueOf(args.getClass()));
        System.out.println(" length " + args.length);
    }
    static  void g (int... args){
        System.out.printf(String.valueOf(args.getClass()));
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args) {
        f('b', 'c');
        f('a');
        f();
        g(2, 3);
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}   /* Output:
class [Ljava.lang.Character; length 2
class [Ljava.lang.Character; length 1
class [Ljava.lang.Character; length 0
class [I length 2
class [I length 1
class [I length 0
int[]: class [I
*///:~
