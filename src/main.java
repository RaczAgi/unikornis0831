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
}
