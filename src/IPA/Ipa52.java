package IPA;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
// Use this editor to write, compile and run your Java code online

class Employee{
    int empId;
    String empName;
    String dept;
    int rating;
    int salary;
    public Employee(int empId,String empName,String dept,int rating,int salary){
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.rating = rating;
        this.salary = salary;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public String getDept(){
        return dept;
    }
    public int getRating(){
        return rating;
    }
    public int getSalary(){
        return salary;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] empArr = new Employee[5];
        for(int i=0;i<empArr.length;i++){
            int empId = sc.nextInt();
            sc.nextLine();
            String empName = sc.nextLine();
            String dept = sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            int salary = sc.nextInt();
            sc.nextLine();
            empArr[i] = new Employee(empId,empName,dept,rating,salary);
        }
        int amount = sc.nextInt();
        sc.nextLine();
        String secondDept =  sc.nextLine();
        Employee[] deptData = findDept(empArr,amount);
        int secondSalary = findSecondHighestSalary(empArr,secondDept);
        if(deptData == null){
            System.out.println("No Department Found");
        }else{
            for(Employee dept :deptData){
                System.out.print(dept.getDept());
            }
        }
        System.out.println(secondSalary > 0 ? secondSalary : "No data found");
        sc.close();
    }
    public static Employee[] findDept(Employee[] empArr,int amount){
        List<Employee> empList = new ArrayList<>();
        for(Employee emp : empArr){
            if(amount == emp.getSalary() && emp.getRating() >= 3){
                empList.add(emp);
            }
        }
        if(empList.size() == 0)return null;
        Employee[] deptArr = new Employee[empList.size()];
        for(int i=0;i<empList.size();i++){
            deptArr[i] = empList.get(i);
        }
        return deptArr;
    }
    public static int findSecondHighestSalary(Employee[] empArr,String dept){
        int firstSalary = 0;
        int secondSalary = Integer.MIN_VALUE;
        for(Employee emp : empArr){
            if(dept.equalsIgnoreCase(emp.getDept())){
                int sal = emp.getSalary();
                if( sal > firstSalary){
                    secondSalary = firstSalary;
                    firstSalary = sal;
                }else if(sal < firstSalary && sal > secondSalary){
                    secondSalary = sal;
                }
            }
        }
        return secondSalary == Integer.MIN_VALUE ? 0 : secondSalary;
    }

}