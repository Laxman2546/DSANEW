package IPA.Assignment;

import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    double salary;
    int experience;
    String designation;
    public Employee(int empId,String empName,double salary,int experience){
            this.empId = empId;
            this.empName= empName;
            this.salary = salary;
            this.experience = experience;
            this.designation = null;
    }
    public void computeDesignation(Employee emp)    {
        int exp = emp.experience;
        if(exp >= 10){
            this.designation = "PM";
        }
        else if(exp >= 7 && exp <= 9){
            this.designation = "PL";
        } else if (exp >5 && exp <=7) {
            this.designation = "SSE";
        }else if(exp > 1 && exp <= 5){
            this.designation= "SE";
        } else{
            designation = "TR";
        }
    }
    public void printEmployeeDetails(Employee emp){
            System.out.println(emp.empId);
            System.out.println(emp.empName);
            System.out.println(emp.salary);
            System.out.println(emp.experience);
            switch (emp.designation){
                case "PM":
                    System.out.println("Project Manager");
                    break;
                case "PL":
                    System.out.println("Project Lead");
                    break;
                case "SSE":
                    System.out.println("Senior Software Engineer");
                    break;
                case "SE":
                    System.out.println("Software Engineer");
                    break;
                case "TR":
                    System.out.println("Trainee");
                    break;
            }

    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] empArr = new Employee[3];
        for(int i=0;i<empArr.length;i++){
        int id = sc.nextInt();
        sc.nextLine();
        String empName = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        int experience = sc.nextInt();
        sc.nextLine();
        empArr[i] = new Employee(id,empName,salary,experience);
        }
        for(Employee emp : empArr){
            emp.computeDesignation(emp);
            emp.printEmployeeDetails(emp);
        }
    }
}
