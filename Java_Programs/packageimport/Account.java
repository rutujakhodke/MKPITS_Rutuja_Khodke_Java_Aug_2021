//3.example of accessing package from another package.
package sbi;
public class Account{
 int bal=1000;
public String deposit(int amt){
 bal=bal+amt;
return "Amount deposited ,balance is :"+bal;
 }
}