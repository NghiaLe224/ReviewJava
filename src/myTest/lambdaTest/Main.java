package myTest.lambdaTest;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.run();

        Animal dog1 = new Dog(){
            @Override
            public void run(){
                System.out.println("Dog is running by anonymous class...");
            }
        };
        dog1.run();

        Animal dog2 = () -> System.out.println("dog is running by lambda...");
        dog2.run();


    }
}
