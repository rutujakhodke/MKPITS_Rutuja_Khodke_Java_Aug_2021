//9.wap to accept empname,designation and salary.calculate bonus.
#include<stdio.h>
int main()
{
	char empname[20];
	char designation[10];
	float salary,bonus;
	float bonusCalc;
	printf("enter a employee name :");
	scanf("%s",&empname);
	printf("\n enter a employee designation :");
	fflush(stdin);
	gets(&designation);
	printf("\n enter a employee salary :");
	scanf("%f",&salary);
	printf("\n enter a employee bonus :");
	scanf("%f",&bonus);
	bonusCalc=salary+bonus;
	
	printf("\n empname=%s",empname);
	printf("\n designation=%s",designation);
	printf("\n salary=%.2f",salary);
	printf("\n bonus=%.2fbonus",bonus);
	printf("\n total salary with bonus=%.2f",bonusCalc);
}

