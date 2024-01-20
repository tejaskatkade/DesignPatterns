package abstractfactory;

public class Client {
    public static void main(String[] args) {
        
        Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(emp1.name());
        System.out.println(emp1.salary());

        Employee emp2 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(emp2.name());
        System.out.println(emp2.salary());
        
    }
}
