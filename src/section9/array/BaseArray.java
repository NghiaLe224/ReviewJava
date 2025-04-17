package section9.array;

import java.util.Arrays;

public class BaseArray {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        myIntArray[0] = 55.0;
//        myIntArray[1] = "1";
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5 , 6, 7 , 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last num of array = " + firstTen[arrayLength - 1]);
        System.out.println("-".repeat(30));
        int[] newArray;
//        newArray = {5, 4, 3, 2, 1};
        newArray = new int[]{5, 4, 3, 2, 1};
//        newArray = new int[5];
        for (int j : newArray) {
            System.out.println(j + " ");
        }
        System.out.println(Arrays.toString(newArray));
        String separate = "-".repeat(30);
        System.out.println(separate);
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        System.out.println(separate);
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        for(Object o : objectArray){
            System.out.println(o);
        }
    }
}
