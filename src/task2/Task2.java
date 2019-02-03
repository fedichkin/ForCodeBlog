package task2;

public class Task2 {

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int index = 0;
        int multiplication = 0;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        while (index != b) {
            index = index + 1;
            multiplication = multiplication + a;
        }

        System.out.println("a * b = " + multiplication);
    }
}
