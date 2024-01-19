package factory;

//Factory design pattern

//When there is superclass and multiple subclasses and we want to get object of subclass based on input and requirement, 
//Then we create factory class which takes the responsibility of creating object of class based on input

// Advantages
// 1. Focus on creating object for interfaces rather than implementaton (focus on Employee not on java / android developer)
// 2. Loose coupling more robust code ()

public class EmployeeFactory {
    
    public static Employee getEmployee(String empName){

        if(empName.trim().equalsIgnoreCase("JAVA DEVLOPER")){
            return new JavaDevloper();
        }else if(empName.trim().equalsIgnoreCase("ANDROID DEVLOPER")){
            return new AndroidDev();
        }else if(empName.trim().equalsIgnoreCase("WEB DEVLOPER")){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
