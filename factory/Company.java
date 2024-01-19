package factory;
class Company{
    public static void main(String[] args) {
        
        //Employee emp = new AndroidDev();
        //This can tight coupling

        //so we can use Factory design pattern

        Employee emp1 = EmployeeFactory.getEmployee("android devloper");
        System.out.println(emp1.salary());

        Employee emp2 = EmployeeFactory.getEmployee("web devloper");
        System.out.println(emp2.salary());

        Employee emp3 = EmployeeFactory.getEmployee("java devloper");
        System.out.println(emp3.salary());
    }
}