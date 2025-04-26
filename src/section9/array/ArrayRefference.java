package section9.array;

import java.util.Arrays;

public class ArrayRefference {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] myNewArray = myArray;

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("MyNewArray = " + Arrays.toString(myNewArray));

        myNewArray[0] = 1;

        System.out.println("after change myArray = " + Arrays.toString(myNewArray));
        System.out.println("After change myNewArray = " + Arrays.toString(myNewArray));
    }

}
