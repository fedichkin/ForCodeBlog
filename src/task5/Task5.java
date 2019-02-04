package task5;

public class Task5 {

    public static void main(String[] args) {
        printSimpleNumbers(1000);
    }

    private static void printSimpleNumbers(int toNumber) {
        boolean [] isSimple = new boolean[toNumber + 1];

        for (int index = 0; index < isSimple.length; index++) {
            isSimple[index] = true;
        }

        for (int i = 2; i * i <= toNumber; i++) {
            if(isSimple[i]) {
                for (int j = i; i * j <= toNumber; j++) {
                    isSimple[i * j] = false;
                }
            }
        }

        for (int index = 0; index < isSimple.length; index++) {
            if (isSimple[index]) {
                System.out.println(index);
            }
        }
    }
}
