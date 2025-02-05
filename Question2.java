package question;
import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public  static class Employee{

        String name;
        String department;

        public Employee(String name , String department){
            this.name = name;
            this.department = department;
        }
    }

    public static void main(String[] args) {

        List<Employee>  employeeList = new ArrayList<>();

        Employee employee1 = new Employee("shivani", "HR");
        Employee employee2 =  new Employee("abhi", "HR");
        Employee employee3 =  new Employee("abhi", "ENGG");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        long count = employeeList.stream().filter(emp -> emp.department.equals("HR")).count();
        System.out.println(count);

    }
}
