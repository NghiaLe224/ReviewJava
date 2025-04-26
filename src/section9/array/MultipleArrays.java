package section9.array;

import java.util.Arrays;
import java.util.Objects;

public class MultipleArrays {
    public static void main(String[] args) {
        int[][] array = new int [4][4];
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        for( int[] outer : array){
//            System.out.println(outer);
            System.out.println(Arrays.toString(outer));
        }

        System.out.println("-".repeat(30));

        for(int i = 0; i < array.length; ++i){
            var innerArray = array[i];
            for(int j = 0; j < innerArray.length; ++j){
//                System.out.print(array[i][j] + " ");
                array[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }

//        for( var outer : array){
//            for( var element : outer){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array));
        array[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array));

        System.out.println("-".repeat(30));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        System.out.println("-".repeat(20));
        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("-".repeat(20));
        anyArray[1] = new String[][] {
                {"1", "2"},
                {"3", "4" , "5"},
                {"6", "7" , "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("-".repeat(20));
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

    }
}
