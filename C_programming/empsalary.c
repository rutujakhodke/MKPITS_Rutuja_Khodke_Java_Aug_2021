//10.wap to accept basic_salary of employee and then calculate
             // hra=25%of basic_salary
             // da=35%of basic_salary
              //totalsalary=hra+da+basic_salary
  int main()
  {
  	char name;
  	int basic_salary;
  	float hra,da,totalsalary;
  	printf("enter a employee name :");
  	scanf("%s",&name);
  	printf("\nenter a employee basic_salary :");
  	scanf("%f",&basic_salary);
  	
  	hra=basic_salary*.25f;
  	printf("\n hra =%.2f",hra);
  	da=basic_salary*.35f;
  	printf("\n da =%.2f",da);
  	totalsalary=hra+da+basic_salary;
  	printf("\n totalsalary =%.2f",totalsalary);
  	
}            
