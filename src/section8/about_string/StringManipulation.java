package section8.about_string;

public class StringManipulation {
    public static void main(String[] args) {
        String birthDate = "01/01/1111";
        int startingIndex = birthDate.indexOf("1111");

        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);
    }
}
