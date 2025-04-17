package about_inheritance;

public class Employee extends Worker{
    private static long employeeNo = 1;
    private String hireDate;
    private long employeeId;

    public Employee() {
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
