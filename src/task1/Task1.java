package task1;

public class Task1 {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        System.out.println("Before");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}