package myTest.myGenerics.distinguishType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    // bai 1
    public static <T> void printItems(List<T> items){
        for (T item : items) {
            System.out.println(item);
        }
    }

    // bai 2
    public static void adddStringItem(List<? super String> list){
        list.add("hello");
    }

    //bai 3
    public static <T extends Comparable<T>> T getMax(T value1, T value2){
        return (value1.compareTo(value2) >= 0) ? value1 : value2;
    }

    //bai 4
    public static double totalSum(List<? extends Number> list){
        double sum = 0;
        for(Number s : list){
            sum += s.doubleValue();
        }
        return sum;
    }

    //bai 5
    public static void copyData(List<? extends Integer> source, List<? super Integer> target){
        target.addAll(source);
    }




    public static void main(String[] args) {


    }
}


