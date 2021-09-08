//12.wap to create structure array of 5 elements of structure book.
struct book
{
	int bookId;
	char title[10];
	char author[20];
	float price
};
void display(struct book b1);
#include<stdio.h>
int main()
{
	struct book b[5];
	int i=0;
	while(i<5)
	{
		printf("\n enter a bookId :");
		scanf("%d",&b[i].bookId);
		
		printf("enter a book title :");
		fflush(stdin);
		gets(b[i].title);
		
		printf(" enter a book author :");
		scanf("%s",&b[i].author);
		
		printf("enter a book price :");
		scanf("%f",&b[i].price);
		
		printf("\n book[%d] details are :",i+1);
		display(b[i]);//passing structure to function
		i++;
		
		printf("\n");
		
	}
}
void display(struct book b1)
{
	printf("\n bookId=%d",b1.bookId);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
	printf("\n price=%f",b1.price);
}

