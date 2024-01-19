package abstractfactory;

public class webDevFactory extends EmpAbstractFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDev();
    }
    
}
