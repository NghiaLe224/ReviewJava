package AboutStringBuilder;


public class StringBuilder {
    public static void main(String[] args) {

    }

    public static void printInformation(String string){
        System.out.println("String: " + string);
        System.out.println("length: " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder: " + builder);
        System.out.println("length: " + builder.length());
    }

}
