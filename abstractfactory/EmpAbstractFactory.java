package abstractfactory;

//Factory of factories
// More flexible
// You can add new employee at runtime No need to compile whole code again


public abstract class EmpAbstractFactory {
    
    public abstract Employee creatEmployee();
}
