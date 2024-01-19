package factory;

public class AndroidDev implements Employee {
    private float salary = 60000;

    @Override
    public float salary() {
        System.out.print("Salary of Android devloper :");
        return salary; 
    }
    
}
