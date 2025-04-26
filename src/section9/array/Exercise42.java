package section9.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        int elements = readInteger();
        int[] arr = readElements(elements);
        System.out.println(Arrays.toString(arr));
        System.out.println("Your min element  is " + findMin(arr));


    }

    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        return elements;
    }

    private static int[] readElements(int elements){
        Scanner sc = new Scanner(System.in);
        int[] elementsArray = new int[elements];
        for (int i = 0; i < elementsArray.length; i++) {
            elementsArray[i] = sc.nextInt();
        }
        return elementsArray;
    }

    private static int findMin(int... arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
