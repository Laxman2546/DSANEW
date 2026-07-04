package IPA;
import java.util.*;

public class Iparecent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Truck[] truckArr = new Truck[count];
        for(int i=0;i<count;i++){
            int tId = sc.nextInt();
            sc.nextLine();
            String tName = sc.nextLine();
            float tMiles = sc.nextFloat();
            sc.nextLine();
            int dId = sc.nextInt();
            sc.nextLine();
            String dName = sc.nextLine();
            String dContact = sc.nextLine();
            float dExp = sc.nextFloat();
            sc.nextLine();
            if(tName!= null || dName != null || tName != " " || dName != " " || tId>0 || dId > 0){
                truckArr[i] = new Truck(tId,tName,tMiles,dId,dName,dContact,dExp);
            }
        }
        float miles = sc.nextFloat();
        sc.nextLine();
        Truck[] ans = getAllTruckDistance(truckArr,miles);
        if(ans == null){
            System.out.println("No Truck Found");
        }else{
            for(Truck tru :ans){
                System.out.println(tru.getId());
                System.out.println(tru.getName());
                System.out.println(tru.getTotalMiles());
                System.out.println(tru.getDid());
                System.out.println(tru.getDname());
            }
        }
        sc.close();
    }
    public static Truck[] getAllTruckDistance(Truck[] truckArr,float dist){
        List<Truck> res = new ArrayList<>();
        for(Truck truck : truckArr){
            if(truck.getTotalMiles()>= dist){
                res.add(truck);
            }
        }
        if(res.isEmpty())return null;
        res.sort((a,b)->Float.compare(a.getDexperience(),b.getDexperience()));
        Truck[] ans = new Truck[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
class Truck extends Driver{
    int id;
    String name;
    float totalMiles;
    public Truck(int id,String name,float totalMiles,int dId,String dName,String dContact,float dExperience){
        super(dId,dName,dContact,dExperience);
        this.id = id;
        this.name = name;
        this.totalMiles = totalMiles;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getTotalMiles(){
        return totalMiles;
    }
}
class Driver{
    int id;
    String name;
    String contact;
    float experience;
    public Driver(int id, String name,String contact,float experience){
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.experience = experience;
    }
    public int getDid(){
        return id;
    }
    public String getDname(){
        return name;
    }
    public String getDcontact(){
        return contact;
    }
    public float getDexperience(){
        return experience;
    }
}
