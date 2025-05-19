package section13.nestedClasses.localAndAnonymousChallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(String firstName, String lastName, String hireDate){}

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(List.of(
                new Employee("Nghia", "Le", "27/04/1998"),
                new Employee("Trieu", "Do", "21/06/2001"),
                new Employee("Thao", "Le", "29/12/1995"),
                new Employee("Tuan", "Nguyen", "21/04/1995")
        ));

        printOrderedList(employees, "name");
        System.out.println();
        printOrderedList(employees, "year");


    }

    public static void printOrderedList(List<Employee> employees, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee{
            Employee containedEmployee;
            int yearWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                this.yearWorked =
                        currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                this.fullName = String.join(containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an employee for %d years".formatted(fullName, yearWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for(Employee employee : employees) {
            list.add(new MyEmployee(employee));
        }
        var comparator = new Comparator<MyEmployee>(){

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if(sortField.equals("name")){
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearWorked - o2.yearWorked;
            }
        };

        list.sort(comparator);
        for(MyEmployee employee : list){
            System.out.println(employee);
        }
    }
}
