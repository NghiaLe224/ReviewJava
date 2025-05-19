package myTest.lambdaTest;

public class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }

    public static void eat(){
        System.out.println("Dog is eating...");
    }
}
