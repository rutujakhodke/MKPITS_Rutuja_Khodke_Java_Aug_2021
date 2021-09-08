//2.wap to check whether amount to be deposited or withdrawl.
int main()
{
	int accno,amount;
	int bal=1000;
	printf("enter a user account number :");
	scanf("%d",&accno);
	printf("enter a deposit :");
	scanf("%d",&amount);
	deposit(accno,amount,bal);
	withdrawl(accno,amount,bal);
	showbalance(accno,bal);
}
void deposit(int accno,int amount,int bal)
{
	if(amount>0)
	{
		bal=bal+amount;
		printf("\n account number :%d",accno);
		printf("\n amount deposited,balance amount is :%d",bal);
	}
	else
	{
		printf("\n amount should be deposited should be greater than 0");
	}
}
void withdrawl(int accno,int amount,int bal)
{
	if(amount<=bal)
	{
		bal=bal+amount;
		printf("\n account number :%d",accno);
		printf("\n amount withdrawl,balance amount is :%d",bal);
	}
	else
	{
		printf("\n no withdrawl due to insufficient balance.");
	}
}
void showbalance(int accno,int bal)
{
	printf("\n account number :%d",accno);
	printf("\n balance amount is :%d",bal);
}
