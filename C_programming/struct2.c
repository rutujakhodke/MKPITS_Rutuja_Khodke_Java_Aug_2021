//2..create a structure student with members rno,name,course,address and mobile no.
struct student
{
	int rno;
	char name[10];
	char course[10];
	char address[10];
	double mobileno;
	
};
int main()
{
	struct student s1;
	s1.rno=10;
	strcpy(s1.name,"ramesh");
	strcpy(s1.course,"python");
	strcpy(s1.address,"sadar nagpur");
	s1.mobileno=8234902390;
	
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n course=%s",s1.course);
	printf("\n address=%s",s1.address);
	printf("\n mobileno=%lf ",s1.mobileno);
	
}
