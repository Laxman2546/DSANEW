package IPA;
import java.util.Scanner;
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;
    public Resort(int resortId,String resortName,String category,double resortPrice,double resortRating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }
    public int getResortId(){
        return resortId;
    }
    public String getResortName(){
        return resortName;
    }
    public String getCategory(){
        return category;
    }
    public double getResortPrice(){
        return resortPrice;
    }
    public double getResortRating(){
        return resortRating;
    }
}

public class Ipa55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iam running");
        Resort[] resort = new Resort[4];
        for(int i=0;i<resort.length;i++){
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double resortPrice = sc.nextDouble();
            sc.nextLine();
            double resortRating = sc.nextDouble();
            sc.nextLine();
            resort[i] = new Resort(resortId,resortName,category,resortPrice,resortRating);
        }
        String category  = sc.nextLine();
        int avg = findAvgPrice(resort,category);
        System.out.println(avg > 0 ?"The Average price of"+category+":"+avg :"No such Resort found");
    }
    public static int findAvgPrice(Resort[] resortArr,String category){
        double sum = 0;
        int count = 0;
        for(Resort resort : resortArr){
            if(category.equalsIgnoreCase(resort.getCategory()) && resort.getResortRating() > 4){
                count++;
                sum+= resort.getResortPrice();
            }
        }
        return count > 0 ? (int) sum / count : 0;
    }
}