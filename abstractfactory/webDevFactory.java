package abstractfactory;

public class WebDevFactory extends EmpAbstractFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDev();
    }
    
}
