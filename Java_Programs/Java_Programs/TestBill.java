//Problem Statement:
//You need to calculate the electricity bill based on the below parameters

   // Input parameters will be
     //   Usage in units
   // The bill will be calculated as per below slab
       // 0-100 units (Rs. 3.44 per unit)
       // 101-300 units (Rs. 7.34 per unit)
        //301-500 units (Rs. 10.36 per unit)
       // 501-1000 units (Rs. 11.82 per unit)
       // >1000 units (Rs. 11.82 per unit)
    //Apart from the above slab, there are few fixed costs added to each bill as below
       // Mandatory Cost: Rs. 200
       // Vehicle Cost @ 1.38 per unit
       // Tax @ 16% on total cost
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
      cost=unit*7.34;
     }
     else if(unit>300 && unit<=500){
      cost=unit*10.36;
     }
     else if(unit>500 && unit<=1000){
     cost=unit*11.82;
     }
     else if(unit>1000){
      cost=unit*11.82;
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
    class TestBill{
    public static void main(String args[]){
    Bill b=new Bill();
    Scanner s=new Scanner(System.in);
    System.out.println("enter a unit:");
    int unit =s.nextInt();
    b.calculateBill(unit);
     }
    }






















































