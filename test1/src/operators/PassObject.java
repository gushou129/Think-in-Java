///: operators/PassObject.java
// Passing objects to methods may not be
// what you're used to
package operators;
class Letter {
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(){
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        System.out.println("1: x: " + x);
        System.out.println((x));
        f(x);
        System.out.println("2: x.c: " + x.c);
        System.out.println("2: x: " + x);
    }
}
