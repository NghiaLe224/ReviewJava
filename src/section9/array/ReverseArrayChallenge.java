package section9.array;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        reverseArray(new int[] {1, 2, 3, 4, 5});
    }

    private static void reverseArray(int[] unsortedArr) {
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArr));
        int[] sortedArr = Arrays.copyOf(unsortedArr, unsortedArr.length);
        int half = sortedArr.length / 2;
        int maxIndex = sortedArr.length - 1;
        for (int i = 0; i < half; i++) {
            int temp = sortedArr[i];  //1
            sortedArr[i] = sortedArr[maxIndex - i]; //5
            sortedArr[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(sortedArr));
    }
}
