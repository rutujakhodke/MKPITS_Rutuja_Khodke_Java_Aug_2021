//4.wap to create an float array of 5 elements to store 5 decimal no. and accept 5 decimal no.from the user then display 
//the values stored in an array(using for loop).
 int main(){
 	int i;
 	float num[5];
 	for(i=0;i<5;i++){
 		printf("\n Enter a decimal number. :");
 		scanf("\n %f",&num[i]);
	 }
	 for(i=0;i<5;i++){
	 	printf("\n num[%d]=%f",i,num[i]);
	 }
 }
