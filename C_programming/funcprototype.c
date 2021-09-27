//15.wap to create a 3 functions 
//1.calTotal,calPercentage and display grade accept 3 subject marks and display the result.
float calPercentage(int totalmarks);//declaring function prototype
void displayGrade(float per);
int main(){
	int sub1,sub2,sub3,tot;
	float per=0.0f;
	printf("Enter a 3 subject marks :");
	scanf("%d %d %d",&sub1,&sub2,&sub3);
	tot=calTotal(sub1,sub2,sub3);
	printf("\n Total marks =%d",tot);
	per=calPercentage(tot);
	printf("\n Percentage =%f",per);
	displayGrade(per);
}
int calTotal(int s1,int s2,int s3){
	int total=s1+s2+s3;
	return total;
}
float calPercentage(int totalmarks){
	float p;
	p=(float)(totalmarks/300.0f)*100.0f;
	return p;
}
void displayGrade(float per){
	if(per>=75){
		printf("\n grade=distinction");
	}
	else if(per>=60 && per<75){
		printf("\n grade=first");
	}
	else if(per>=40 && per<60){
		printf("\n grade=second division");
	}
	else{
		printf("\n grade=fail");
	}
}

