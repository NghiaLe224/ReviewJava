package section9.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        reverse(arr);

    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int maxIndex = arr.length - 1;
        int half = arr.length / 2;
        for (int i = 0; i < half; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
