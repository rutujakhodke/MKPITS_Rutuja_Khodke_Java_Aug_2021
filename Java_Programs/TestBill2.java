//another example of electricity bill.
import java.util.*;
    class Bill{
    double cost=0;
    double mandatoryCost=200;
    double vehicleCost=0;
    double totalCost=0;
    double tax=0;

    void calculateBill(int unit){
    if(unit<=100){
     cost=unit*3.44;
     }
     else if(unit>100 && unit<=300){
      cost=100*3.44+(unit-100)*7.34;
     }
     else if(unit>300 && unit<=500){
      cost=100*3.44+200*7.34+(unit-300)*10.36;
     }
     else if(unit>500 && unit<=1000){
     cost=100*3.44+200*7.34+300*10.36+(unit-500)*11.82;
     }
     else if(unit>1000){
      cost=100*3.44+200*7.34+300*10.36+(unit-1000)*11.82;
     }
     vehicleCost=1.38*unit;
     totalCost=cost+vehicleCost+mandatoryCost;
     tax=totalCost*0.16;

     System.out.println("Vehicle cost 1.38 per unit :"+vehicleCost);
     System.out.println("tax 16% of cost :"+tax);
     totalCost=totalCost+tax;

     System.out.println("Total Electricity Bill Amount is :"+totalCost);

     }
    }
    class TestBill2{
    public static void main(String args[]){
    Bill b=new Bill();
    Scanner s=new Scanner(System.in);
    System.out.println("enter a unit:");
    int unit =s.nextInt();
    b.calculateBill(unit);
     }
    }
























