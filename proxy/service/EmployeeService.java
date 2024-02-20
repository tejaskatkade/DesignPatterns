package proxy.service;

import proxy.entity.Employee;

public interface EmployeeService {

    public void createEmp(String client, Employee employee) throws Exception;  
    public void deleteEmp(String client, int empId) throws Exception;  
    public Employee getEmp(String client, int empId);  
}