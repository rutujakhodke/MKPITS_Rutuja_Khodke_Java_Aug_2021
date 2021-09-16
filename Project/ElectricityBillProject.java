//Problem Statement:
//You need to calculate the electricity bill based on the below parameters
   // Input parameters will be
    //    Usage in units
   // The bill will be calculated as per below slab
        //0-100 units (Rs. 3.44 per unit)
       // 101-300 units (Rs. 7.34 per unit)
       // 301-500 units (Rs. 10.36 per unit)
       // 501-1000 units (Rs. 11.82 per unit)
       // >1000 units (Rs. 11.82 per unit)
   // Apart from the above slab, there are few fixed costs added to each bill as below
     //   Mandatory Cost: Rs. 200
      //  Vehicle Cost @ 1.38 per unit
      //  Tax @ 16% on total cost.

   import java.util.*;
   class ElectricityBillProject{
	public static void main(String args[]){
   int unit;
   double mandatoryCost=200;
   double vehicleCost=0;
   double tax=0;
   double totalAmount=0;
   double cost_charge=0;
   double totalAmount_with_tax=0;
   String customerName;

   Scanner s=new Scanner(System.in);
   System.out.println("Enter a Customer Name :");
   customerName=s.nextLine();
   System.out.println("Enter a number of units consumed per month :");
   unit=s.nextInt();

  if(unit<=100){
	  cost_charge=unit*3.44;
	 }
	else if(unit>100 && unit<=300){
	  cost_charge=unit*7.34;
	 }
	 else if(unit>300 && unit<=500){
	  cost_charge=unit*10.36;
	 }
	 else if(unit>500 && unit<=1000){
	  cost_charge=unit*11.82;
	 }
	 else if(unit>1000){
	  cost_charge=unit*11.82;
	 }

   vehicleCost=1.38*unit;
   totalAmount=cost_charge + mandatoryCost + vehicleCost;
   tax=totalAmount*0.16;
   totalAmount_with_tax=totalAmount + tax;

   System.out.println("Customer Name :"+customerName);
   System.out.println("Units consumed per month :"+unit);
   System.out.println("Cost charge with unit consumed per month ="+cost_charge);
   System.out.println("Vehicle cost @ 1.38 per unit ="+vehicleCost);
   System.out.println("Total Amount without applying Tax ="+totalAmount);
   System.out.println("Tax @ 16% applying on total Amount ="+tax);
   System.out.println("Total Electricity Bill Amount is pay by customer ="+totalAmount_with_tax);
 }
}
