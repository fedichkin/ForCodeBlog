package task6;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(getLengthPeriod(2));
        System.out.println(getLengthPeriod(3));
        System.out.println(getLengthPeriod(4));
        System.out.println(getLengthPeriod(7));
        System.out.println(getLengthPeriod(28));
        System.out.println(getLengthPeriod(38));
        System.out.println(getLengthPeriod(140));
    }

    private static int getLengthPeriod(int number) {
        int len = 0;
        int num = 10;
        int firstRest = -1;

        if (number == 1) {
            return 0;
        }

        while (number % num != number) {
            num = num * 10;
        }

        while (firstRest != num && num != 0) {
            if (len == 1) {
                firstRest = num;
            }

            while (num / number == 0) {
                num = num * 10;
                len++;
            }

            num = num % number;
        }

        return num == 0 ? len : (len - 1);
    }
}
