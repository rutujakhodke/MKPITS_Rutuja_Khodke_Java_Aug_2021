//4.wap to accept accno,amount and transaction(whether you want to deposit or withdrawl or showbalance)
//and call the appropriate function.
int main()
{
	int accno,amount;
	int bal=1000;
	char transaction[20];
	printf("enter a user account number :");
	scanf("%d",&accno);
	printf("enter a amount :");
	scanf("%d",&amount);
	printf("enter a transaction type : deposit or withdrawl :");
	scanf("%s",&transaction);
	if(strcmp(transaction,"deposit")==0)
	{
		bal=deposit(accno,amount,bal);
		showbalance(accno,bal);
	}
	if(strcmp(transaction,"withdrawl")==0)
	{
		bal=withdrawl(accno,amount,bal);
		showbalance(accno,bal);
	}
}
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
	

