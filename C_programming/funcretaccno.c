//3.wap to create a function deposit,withdrawl returning balance.
int main()
{
	int accno,amount;
	int bal=1000;
	printf("enter a user account number :");
	scanf("%d",&accno);
	printf("enter a amount deposit :");
	scanf("%d",&amount);
	bal=deposit(accno,amount,bal);
	bal=withdrawl(accno,amount,bal);
	showbalance(accno,bal);
}
//function returning value.
int deposit(int accno,int amount,int bal)
{
	if(amount>0)
	{
		bal=bal+amount;
		printf("\n account number :%d",accno);
		printf("\n amount deposited ,balance amount is :%d",bal);
	}
	else
	{
		printf("\n amount deposited should be greater than 0.");
	}
	return bal;
}
int withdrawl(int accno,int amount,int bal)
{
	if(amount<=bal)
	{
		bal=bal+amount;
		printf("\n account number :%d",accno);
		printf("\n amount withdrawl,balance amount is :%d",bal);
	}
	else
	{
		printf("\n no withdrawl due to insufficient balance .");
	}
	return bal;
}
void showbalance(int accno,int bal)
{
	printf("\n account number :%d",accno);
	printf("\n balance amount is :%d",bal);
}
