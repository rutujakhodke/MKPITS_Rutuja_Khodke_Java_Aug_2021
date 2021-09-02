//6.wap to accept empno,firstname,lastname,designation and salary of the employee and display it.
#include<stdio.h>
int main()
{
	int empno;
	char firstname[20];
	char lastname[20];
	char designation[20];
	float salary;
	 
	 printf("enter empno. :");//declare empno.
	 scanf("%d",&empno);
	 
	 printf("enter firstname :");//declare firstname
	 fflush(stdin);
	 gets(firstname);
	 
	 
	 printf("enter lastname  :");//declare lastname
	 fflush(stdin);
	 gets(lastname);
	 
	 
	 printf("enter designation :");//declare designation
	 gets(designation);
	 fflush(stdin);
	 
	 printf("enter a salary :");//declare salary
	 scanf("%f",&salary);
	 
	 //print the above statements.
	 printf("\n employee details are :");
	 printf("\nempno=%d",empno);
	 printf("\nfirstname=%s",firstname);
	 printf("\nlastname=%s",lastname);
	 printf("\ndesignation=%s",designation);
	 printf("\nsalary=%f",salary);
	 
}
