package IPA;
import java.util.Scanner;

public class Ipa2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Footwear[] footArr = new Footwear[5];
        for(int i=0;i<footArr.length;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            footArr[i] = new Footwear(id,name,type,price);
        }
        String fType = sc.nextLine();
        String fName = sc.nextLine();
        int ans = getCountType(footArr,fType);
        Footwear foot = getSecondHigh(footArr,fName);
        System.out.println(ans > 0 ?ans :"Footwear not available");
        System.out.println(foot != null  ? foot.getPrice() + " " +foot.getName() + " " + foot.getType() + " " + foot.getId(): "Brand not available");
    }
    public static int getCountType(Footwear[] footArr,String fType){
        int count =  0;
        for(Footwear foot : footArr){
            if(fType.equalsIgnoreCase(foot.getType())){
                count++;
            }
        }
        return count;
    }
    public static Footwear getSecondHigh(Footwear[] footArr,String fName){
        Footwear firstfoot = null;
        Footwear secondfoot = null;
        for(Footwear foot : footArr){
            if(fName.equalsIgnoreCase(foot.getName())){
                int price = foot.getPrice();
                int firstHigh = firstfoot != null ? firstfoot.getPrice() : 0;
                int secondHigh = secondfoot != null ? secondfoot.getPrice() : 0;
                if( price > firstHigh){
                    secondfoot = firstfoot;
                    firstfoot =  foot;
                }else if(price < firstHigh && price > secondHigh){
                    secondfoot = foot;
                }
            }
        }
        return secondfoot;
    }
}
class Footwear{
    int id;
    String name;
    String type;
    int price;
    public Footwear(int id,String name,String type,int price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }
}

