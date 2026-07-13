package IPA;
import java.util.*;

public class IPACompany {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int employeeNum = sc.nextInt();
        Employee2[] empArr = new Employee2[employeeNum];
        for(int i=0;i<empArr.length;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String empName = sc.nextLine();
            String designation = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();
            empArr[i] = new Employee2(id,empName,designation,salary);
        }
        String getDesig = sc.nextLine();
        Company company = new Company(name,empArr,employeeNum);
        System.out.println(company.getAvgSalary());
        System.out.println(company.getMaxSalary());
        Employee2[] ans = company.getEmployeesDesignation(getDesig);
        for(Employee2 emp : ans){
            System.out.print(emp.getId() + " " + emp.getName() + " " + emp.getDesignation() + " " + emp.getSalary());
        }
    }
}

class Employee2{
    int id;
    String name;
    String designation;
    double salary;
    public Employee2(int id,String name,String designation,double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public double getSalary(){
        return salary;
    }
}

class Company{
    String companyName;
    Employee2[] employeeArr;
    int numEmployees;
    public Company(String companyName,Employee2[] employeeArr,int numEmployees){
        this.companyName = companyName;
        this.employeeArr = employeeArr;
        this.numEmployees = numEmployees;
    }
    public int getAvgSalary(){
        int count = 0;
        int sum = 0;
        for(int i=0;i<employeeArr.length;i++){
            sum += employeeArr[i].getSalary();
            count++;
        }
        return sum/count;
    }
    public double getMaxSalary(){
        double maxSalary = 0;
        for(Employee2 emp : employeeArr){
            if(emp.getSalary() > maxSalary){
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }
    public Employee2[] getEmployeesDesignation(String desig){
        List<Employee2> ls = new ArrayList<>();
        for(Employee2 emp : employeeArr){
            if(desig.equalsIgnoreCase(emp.getDesignation())){
                ls.add(emp);
            }
        }
        if(ls.size() < 1) return null;
        Employee2[] res = new Employee2[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        return res;
    }
}


