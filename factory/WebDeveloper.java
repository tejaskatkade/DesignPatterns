package factory;

public class WebDeveloper implements Employee {
    private float salary = 50000;

    @Override
    public float salary() {
        System.out.print("Salary of Java devloper :");
        return salary; 
    }
    
}
