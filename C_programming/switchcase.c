//1.wap to accept a day no. between 1 and 7 and then display the dayname using switch case.
int main()
{
	int dayno;
	printf("enter day number between 1 and 7 :");
	scanf("%d",&dayno);
	switch(dayno)
	{
		case 1:
			printf("\n monday");
			break;
		case 2:
			printf("\n tuesday");
			break;
		case 3:
			printf("\n wednesday");
			break;
		case 4:
			printf("\n thursday");
			break;
		case 5:
			printf("\n friday");
			break;
		case 6:
			printf("\n saturday");
			break;
		case 7:
			printf("\n sunday");
			break;	
		default:
	        printf("\n invalid dayno.");
			break;	
	}
	return 0;
}
