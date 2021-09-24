//5.wap to create an character array of 5 elements to store 5 character no. and accept 5 character no.from the user then display 
//the values stored in an array(using for loop).
int main(){
	int i;
	char ch[5];
	for(i=0;i<5;i++){
		printf("\n Enter a character. :");
		scanf("\n %c",&ch[i]);
	}
	for(i=0;i<5;i++){
		printf("\n num[%d]=%c",i,ch[i]);
	}
}
