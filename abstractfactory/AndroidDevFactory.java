package abstractfactory;

public class AndroidDevFactory extends EmpAbstractFactory{
    @Override
    public Employee creatEmployee() {
        return new AndroidDev();
    }
}
