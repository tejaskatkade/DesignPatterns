package abstractfactory;

public class WebDev implements Employee {

    @Override
    public float salary() {
        return 60000;
    }

    @Override
    public String name() {
        return "Web Devloper";
    }
    
}
