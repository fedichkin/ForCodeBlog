package task7;

public class Task7 {

    public static void main(String[] args) {
        printSimpleMultipliers(63);
        printSimpleMultipliers(27);
        printSimpleMultipliers(149);
    }

    private static void printSimpleMultipliers(int number) {
        int div = 2;
        int num = number;

        System.out.print(number + " = 1");

        while (num > 1) {
            while (num % div == 0) {
                System.out.print(" * " + div);
                num = num / div;
            }

            div++;
        }

        System.out.println();
    }
}
