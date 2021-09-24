//3.wap to create an integer array of 5 elements to store 5 no. and accept 5 no.from the user then display 
//the values stored in an array(using for loop).
int main(){
	int i;
	int num[5];
	for(i=0;i<5;i++){
		printf("\n Enter a Number :");
		scanf("\n %d",&num[i]);
	}
	for(i=0;i<5;i++){
		printf("\n num[%d]=%d",i,num[i]);
	}
}
