package factory;

public class JavaDevloper implements Employee {
    private float salary = 80000;

    @Override
    public float salary() {
        System.out.print("Salary of Java devloper :");
        return salary; 
    }
    
}
