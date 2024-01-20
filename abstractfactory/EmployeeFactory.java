package abstractfactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmpAbstractFactory employee){
        return employee.creatEmployee();
    }
}
