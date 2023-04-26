package HWClass13;

public class Task4 {
    public static void main(String[] args) {

        String a = "sleeping";
        String b = "soundly";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.print(a + " " + b);
    }
}
/*
How would you swap 2 strings without a temporary variable?

 */
