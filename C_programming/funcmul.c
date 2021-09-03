//24.create a function to print table of a number.
void tables(int);//function declaration.
int main()
{
  int num;
  int i=0;
   printf("\n enter a number :");
   scanf("%d",&num);
   printf("\n Multiplication table for %d is :\n",num);
   printf("------------------------------\n");
   tables(num);
   return 0;
   
}
   void tables(int num)
   {
   	
   	for(i;i<11;i++)
   	{
   	 printf("%d * %d =%ld \n\n",i,num, i*num);	
	}
   	
   }	
																						
