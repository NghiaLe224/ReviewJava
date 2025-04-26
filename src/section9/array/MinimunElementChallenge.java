package section9.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimunElementChallenge {
    public static void main(String[] args) {

        int[] nums = readIntegers();
        System.out.println("Your numbers are" + Arrays.toString(nums));

        int result = findMin(nums);
        System.out.println("Your smallest number is " + result);
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by a commas: ");
        String input = sc.nextLine();

        String[] s = input.split(",");
        int[] arr = new int[s.length];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(s[i].trim());
        }
        return arr;
    }

    private static int findMin(int... arr){
        int min = arr[0];
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
