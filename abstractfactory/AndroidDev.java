package abstractfactory;

public class AndroidDev implements Employee {
    
    @Override
    public float salary() {
        return 70000;
    }

    @Override
    public String name() {
        return "Android Devloper";
    }
}
