//13.wap to accept a no. and print table of that no.

int main()
{
	int num;
	int i=0;
	 printf("program to generate multiplication table : ");
	 printf("\n\n enter no. to generate multipliction table : ");
	 scanf("%d",&num);
	 
	 printf("\n\n multiplication table of %d : \n",num);
	 printf("-------------------------------------\n\n");
	 
	 for(i;i<11;i++)
	 {
	 	printf("%d * %d =%ld \n\n",i,num, i*num);
	 }
	
}
