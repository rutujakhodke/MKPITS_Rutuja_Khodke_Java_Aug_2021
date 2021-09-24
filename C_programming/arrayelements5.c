//6.wap to create an double array of 5 elements to store 5 long decimal no. and accept 5 long decimal no.and accept 5 long 
//decimal no. from the user. 
//then display the long decimal no.  stored in an double array(using for loop).
int main(){
	int i;
	double num[5];
	for(i=0;i<5;i++){
		printf("\n Enter a number. :");
		scanf("\n %lf",&num[i]);
	}
	for(i=0;i<5;i++){
		printf("\n num[%d]=%lf",i,num[i]);
	}
}

