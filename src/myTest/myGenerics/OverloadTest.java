package myTest.myGenerics;

public class OverloadTest {
    // Không hợp lệ:
    // public void print(List<String> list) {}
    // public void print(List<Integer> list) {}
    // → sẽ gây lỗi biên dịch vì type erasure
}
