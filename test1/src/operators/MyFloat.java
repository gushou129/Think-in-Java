//: operators/MyFloat.java
// Assignment with objects is a bit tricky.
package operators;
class F{
    float f;
}

public class MyFloat {
        public void main (){
            F mf1 = new F();
            F mf2 = new F();
            mf1.f = 10.4f;
            mf2.f = 0.1f;

            System.out.println("mf1.f = " + mf1.f);
            System.out.println("mf2.f = " + mf2.f);
            System.out.println("mf1 = " + mf1);
            System.out.println("mf2 = " + mf2);
            System.out.println();

            mf1.f = mf2.f;
            System.out.println("mf1.f = " + mf1.f);
            System.out.println("mf2.f = " + mf2.f);
            System.out.println("mf1 = " + mf1);
            System.out.println("mf2 = " + mf2);
            System.out.println();

            mf1 = mf2;
            System.out.println("mf1.f = " + mf1.f);
            System.out.println("mf2.f = " + mf2.f);
            System.out.println("mf1 = " + mf1);
            System.out.println("mf2 = " + mf2);
            System.out.println();

        }
}   /* Output: (70% match)
mf1.f = 10.4
mf2.f = 0.1
mf1 = operators.F@16b98e56
mf2 = operators.F@7ef20235

mf1.f = 0.1
mf2.f = 0.1
mf1 = operators.F@16b98e56
mf2 = operators.F@7ef20235

mf1.f = 0.1
mf2.f = 0.1
mf1 = operators.F@7ef20235
mf2 = operators.F@7ef20235
*///:~
