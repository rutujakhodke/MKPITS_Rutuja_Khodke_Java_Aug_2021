//9.(Function with parameters and returning nothing(void)).wap to create a function result with 3 int parameters 
//to accept 3 subject marks .calculate and display total,percentage,grade.
void calculateResult(int m1,int m2,int m3){
	int total;
	float per;
 total=m1+m2+m3;
 printf("\n Total of 3 Subject marks are :%d",total);
 per=(float)(total/300.0f)*100.0f;
 printf("\n Percentage of a Student is :%f",per);
 if(per>75){
 	printf("\n grade=distinction");
 }
 else if(per>=60 && per<75){
 	printf("\n grade=first");
 }
 else{
 	printf("\n grade=fail");
 }
 //printf("Grade =",grade);	
}
int main(){
 int m1,m2,m3;
 int total;
 float per;
 printf("Enter a m1 marks :");
 scanf("%d",&m1);
 printf("Enter a m2 marks :");
 scanf("%d",&m2);
 printf("Enter a m3 marks :");
 scanf("%d",&m3);
 calculateResult(m1,m2,m3);
 }

