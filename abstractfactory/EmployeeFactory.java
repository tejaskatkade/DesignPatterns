package abstractfactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmpAbstractFactory aFactory){
        return aFactory.creatEmployee();
    }
}
