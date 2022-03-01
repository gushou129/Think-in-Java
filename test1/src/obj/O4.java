package obj;

public class O4 {
    public static void main() {
        int i = 200;
        long lng = (long) i;    //"Widening, " so cast not really required

        System.out.println(lng);
        System.out.println(i);
        System.out.println("------------");
        lng = i;

        System.out.println(lng);
        System.out.println(i);
        System.out.println("------------");

        long lng2 = 200;
        // A "narrowing conversion":
        i = (int)lng2; // Cast required
        System.out.println(lng2);
        System.out.println(i);
        System.out.println("------------");
    }
}
