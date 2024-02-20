package proxy.service.Impl;

import proxy.entity.Employee;
import proxy.service.EmployeeService;

public class EmployeeProxy implements EmployeeService {

    EmployeeService employeeService;

    public EmployeeProxy(){
        employeeService = new EmployeeImpl();
    }

    @Override
    public void createEmp(String client, Employee employee) throws Exception {
        if(client.equals("Admin")){
            employeeService.createEmp(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void deleteEmp(String client, int empId) throws Exception{
        if(client.equals("Admin")){
            employeeService.deleteEmp(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee getEmp(String client, int empId){
        
        return employeeService.getEmp(client, empId);

    }
    
}
