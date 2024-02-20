package proxy.service.Impl;

import proxy.entity.Employee;
import proxy.service.EmployeeService;

public class EmployeeImpl implements EmployeeService {

    @Override
    public void createEmp(String client, Employee employee){
        System.out.println("Employee created successfully !!");
    }

    @Override
    public void deleteEmp(String client, int empId) {
        System.out.println("Employee deleted with empID :"+ empId+" successfully !!");
    }

    @Override
    public Employee getEmp(String client, int empId) {
        System.out.print("Employee :");
        return new Employee();
    }

   
    
}
