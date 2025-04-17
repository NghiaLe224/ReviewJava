package section8.about_inheritance;

public class HourlyEmployee extends Employee{
    private double hourPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourPayRate) {
        super(name, birthDate, hireDate);
        this.hourPayRate = hourPayRate;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }

    public double collectPay(){
        return 40 * hourPayRate;
    }
}
