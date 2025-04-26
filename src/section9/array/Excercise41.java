package section9.array;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise41 {
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        System.out.println(Arrays.toString(sortIntegers(unsortedArray)));
    }
    public static int[] getIntegers (int length){
        Scanner sc = new Scanner(System.in);
        int[] unsortedArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + i + ": ");
            unsortedArray[i] = sc.nextInt();
        }
        return unsortedArray;
    }
    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }
}
