package IPA;
import java.util.Scanner;

public class IPA39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vegetable[] vegArr = new Vegetable[4];
        for(int i=0;i<vegArr.length;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            vegArr[i] = new Vegetable(id,name,price,rating);
        }
        int rating = sc.nextInt();
        Vegetable minprice = findMin(vegArr,rating);
        System.out.println(minprice != null ?minprice.getId() :"No such Vegetables");
    }
    public static Vegetable findMin(Vegetable[] vegArr,int rat){
        Vegetable minPrice = new Vegetable();
        minPrice.setPrice(Integer.MAX_VALUE);
        for(Vegetable veg : vegArr){
            if(veg.getRating() > rat && veg.getPrice() < minPrice.getPrice()){
                minPrice = veg;
            }
        }
        return minPrice.getPrice() == Integer.MAX_VALUE ? null : minPrice;
    }
}

class Vegetable{
    int vegetableId;
    String vegetableName;
    int price;
    int rating;
    public Vegetable(){};
    public Vegetable(int id,String name,int price,int rating){
        this.vegetableId = id;
        this.vegetableName =name;
        this.price = price;
        this.rating = rating;
    }
    public int getId(){
        return vegetableId;
    }
    public String getName(){
        return vegetableName;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getRating(){
        return rating;
    }
}
