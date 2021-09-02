//10.wap to print no.from 1 to 10 using while,dowhile and for loop.

int main()
{
	int n;
	printf("\n");
	 //while loop
	 n=1;//initalize
	 while(n<=10)//condition
	 {
	 	printf("%d ",n);
	 	n++;//increment
	 }
	 
	 //do while loop
	 printf("\n");
	 n=1;
	 do 
	 {
	 	printf("%d ",n);
	 	n++;
	 }
	 while(n<=10);
	 
     //for loop
     printf("\n");
     n=1;
     for(n=1;n<=10;n++)
     {
     	printf("%d ",n);
     }
     getch();
     

}



