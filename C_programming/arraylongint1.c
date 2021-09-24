//7.wap to create a long int array of 5 elements to store 5 long integer no. and accept 5 long integer no. from the user
//and then display the long integer no. stored in long int array(using for loop).
int main(){
	int i;
	long int num[5];
	for(i=0;i<5;i++){
		printf("\n Enter a number :");
		scanf("\n %ld",&num[i]);
	}
	for(i=0;i<5;i++){
		printf("\n num[%d]=%ld",i,num[i]);
	}
}
