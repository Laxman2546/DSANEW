package oops;

abstract class car{
    abstract void accelerate();
    abstract void startEngine();
    void Brakes(){
        System.out.println("brakes applied");
    }
}

class Vehicle extends car{
     String Company;
     String Model;

    public void setCompany(String Company){
        this.Company = Company;
    }
    public void  setModel  (String Model){
        this.Model = Model;
    }
    public String getCompany(){
        System.out.println("Company Name :"+ Company);
        return  Company;
    }
    public  String getModel(){
        System.out.println("Model Name :" + Model);
        return Model;
    }


    @Override
    void accelerate(){
        System.out.println("car accelerated...");
    }
    @Override
    void startEngine(){
        System.out.println("car started...");

    }
}

public class abstraction {
   public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        vh.setCompany("Alto");
        vh.setModel("800");
        vh.getCompany();
        vh.getModel();
        vh.accelerate();
        vh.startEngine();

    }
}
