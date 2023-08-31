import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int max(int[] array) throws Exception {
        if (array.length == 0) {
            throw new NullPointerException();
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }

    public static int min(int[] array) throws Exception {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int even(int[] array) throws Exception {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int odd(int[] array) throws Exception {
        if (array.length == 0) {
            throw new NullPointerException();
        }
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int sumEvenNumbers(int[] array) {
        if (array.length == 0) {
            throw new NullPointerException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
