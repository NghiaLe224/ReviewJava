package myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeek.values()));
        for(DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.ordinal());
        }

        System.out.println("-".repeat(30));
        System.out.println(DayOfWeek.valueOf("TUES").ordinal());

        // Tạo mảng gốc
        String[] fruits = {"apple", "banana", "cherry"};

        // Tạo danh sách từ mảng - đây là một "view"
        List<String> fruitList = Arrays.asList(fruits);

        // ✅ Có thể cập nhật phần tử
        fruitList.set(1, "blueberry");
        System.out.println("Danh sách sau khi sửa: " + fruitList);
        System.out.println("Mảng sau khi sửa: " + Arrays.toString(fruits));

        // ❌ Không thể thêm hoặc xóa phần tử
        fruitList.add("mango"); // Lỗi: UnsupportedOperationException
    }
}
