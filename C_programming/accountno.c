//1.wap to accept account no. and amount and inital_balance=1000 and create function deposit,
//withdrawl and show_balance.
int main()
{
	int accno,amount;
	int bal=1000;
	printf("enter a user account number :");
	scanf("%d",&accno);
	printf("\n enter a deposit :");
	scanf("%d",&amount);
	//calling the function deposit
	deposit(accno,amount,bal);
	//calling the function withdrawl.
	withdrawl(accno,amount,bal);
	//calling the function show balance
	showbalance(accno,bal);
}
//function return nothing.
void deposit(int accno,int amount,int bal)
{
	bal=bal+amount;
	printf("\n account number :%d",accno);
	printf("\n amount deposited,balance amount is :%d",bal);
}
void withdrawl(int accno,int amount ,int bal)
{
	bal=bal+amount;
	printf("\n account no :%d",accno);
	printf("\n amount withdrawl, balance amount is :%d",bal);
}
void showbalance(int accno,int bal)
{
	printf("\n account number :%d",accno);
	printf("\n balance amount is :%d",bal);
}
