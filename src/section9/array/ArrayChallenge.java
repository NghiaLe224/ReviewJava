package section9.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println(Arrays.toString(sortIntegerArray(unsortedArray)));
    }

    private static int[] getRandomArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static int[] sortIntegerArray(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
