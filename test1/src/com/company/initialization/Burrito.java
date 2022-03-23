package com.company.initialization;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){ this.degree = degree;}
    public void describu() {
        System.out.printf("This burrito is ");
        switch (degree) {
            case NOT : {
                System.out.println("not spicy at all.");
                break;
            }
            case MILD :
            case EMD : {
                System.out.println("a little hot.");
                break;
            }
            case HOT, FLAMING :
            default : System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.EMD),
                jalapeno = new Burrito(Spiciness.HOT);
        plain.describu();
        greenChile.describu();
        jalapeno.describu();

    }
}   /* Output:
This burrito is not spicy at all.
This burrito is a little hot.
This burrito is maybe too hot.
*///:~

