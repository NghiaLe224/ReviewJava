package section8.about_string;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of r = %d %n", helloWorld.indexOf("l"));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf("l"));

        System.out.printf("index of r = %d %n", helloWorld.indexOf("l", 3));
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf("l", 8));

        String helloWorldLowerCase = helloWorld.toLowerCase();
        if (helloWorld.equalsIgnoreCase(helloWorldLowerCase)) {
            System.out.println("value match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length of string: %d %n", length);
        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("string is blank");
        }
        System.out.printf("first character = %c %n", string.charAt(0));

        System.out.printf("last char = %c %n", string.charAt(length-1));
    }
}
