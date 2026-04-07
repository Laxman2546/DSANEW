public class SalaryDeduction {
    public static void main(String[] args) {
            int salary = 50000;
            int tax = salary * 10/100;
            int insurance= salary * 5/100;
             salary = salary - (tax+insurance);
            System.out.println(salary);


    }
}
