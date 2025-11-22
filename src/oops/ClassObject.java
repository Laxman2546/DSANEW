package oops;

class Human{
    String name;
    int age;
   public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String details(){
        return name + age;
    }

}

class Employee extends  Human{
    private final String  employeeRole;
    public Employee(String name, int age,String role) {
        super(name, age);
        this.employeeRole = role;
    }
    public String employeeDetails(){
        return employeeRole + name + age;
    }
}

public class ClassObject {
    public  static void main(String[] args) {
        Human Hm = new Human("Lakshman",21);
        Employee em = new Employee("Harika",20,"Developer");
        String name = Hm.details();
        String EmployeeDet = em.employeeDetails();
        System.out.println(EmployeeDet);
    }
}
