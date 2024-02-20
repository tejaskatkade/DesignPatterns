package proxy;

import proxy.entity.Employee;
import proxy.service.EmployeeService;
import proxy.service.Impl.EmployeeProxy;


public class Main {

    public static void main(String[] args) {
        EmployeeService emp = new EmployeeProxy();
        try {
            emp.createEmp("Admin", new Employee());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
              
    }
}
