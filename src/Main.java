import section8.about_inheritance.Employee;
import section8.about_inheritance.SalariedEmployee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee nghia = new Employee("Nghia", "27/04/1998", "1/2/2025");
        System.out.println(nghia);
        System.out.println("-----------");
        Employee haiTrieu = new Employee("Trieu", "21/06/1998", "1/2/2025");
        System.out.println(haiTrieu);

        System.out.println("-----------");

        SalariedEmployee chung = new SalariedEmployee("Chung", "1/1/1991", "1/1/2025", 10000);
        System.out.println(chung);
        System.out.println("chung's Paycheck = $" + chung.collectPay());

    }
}