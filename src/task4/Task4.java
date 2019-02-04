package task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(nod(36, 15));
        System.out.println(nod(84, 16));
    }

    private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }
}
