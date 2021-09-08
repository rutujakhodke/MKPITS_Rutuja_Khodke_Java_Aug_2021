//4.create an array to store 5 product name and price and display the product name and pass array to function to calculate_price.
//to calculate total price.

int main()
{
	char prod_name[5][20];//2d array of 5 rows and 20 columns to store 5 product names.
	int price[5],i;//create array of price of 5 products .declare i for (for loop).
	for(i=0;i<5;i++)
	{
		printf("enter 5 product name");
		scanf("%s",&prod_name[i]);
		printf("enter 5 product price");
		scanf("%d",&price[i]);
    }
    
    for(i=0;i<5;i++)
    {
    	printf("\n product name = %s",prod_name[i]);
    }
    calculate_price(price);//passing array to function
}
    //creating function calculate_price and passing parameter to it.
    void calculate_price(int price[])
    {
    	int total=0,i;
    	
    	for(i=0;i<5;i++)
    	{
    		total = total + price[i];
        }
        printf("\n total price of products = %d",total);
        
		
	}
	


