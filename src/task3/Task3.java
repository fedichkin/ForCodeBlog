package task3;

public class Task3 {

    public static void main(String[] args) {
        calculate(37, 4);
        calculate(3, 7);
    }

    private static void calculate(int a, int b) {
        int div = 0;
        int mod = 0;
        int tmp = 0;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if (a < b) {
            mod = a;
        } else {
            while((tmp + b) < a) {
                tmp = tmp + b;
                div++;
            }

            mod = a - tmp;
        }

        System.out.println("div(a, b) = " + div);
        System.out.println("mod(a, b) = " + mod);
    }
}
