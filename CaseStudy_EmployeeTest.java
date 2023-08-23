package company.casestudy;
import company.employee.Employee; 

public class CaseStudy_EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Shubham", 30, "Software Developer", 50000.0);
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
