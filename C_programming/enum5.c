//5.wap of enum by using switch case statement.
enum days{sunday=1,monday,tuesday,wednesday,thursday,friday,saturday};

int main()
{
	enum days d;
	d=thursday;
	
	switch(d)
	{
		case sunday:
		printf("today is sunday");
		break;
		case monday:
		printf("today is monday");
		break;
		case tuesday:
		printf("today is tuesday");
		break;
		case wednesday:
		printf("today is wednesday");
		break;
		case thursday:
		printf("today is thursday");
		break;
		case friday:
		printf("today is friday");
		break;
		case saturday:
		printf("today is saturday");
		break;
	}
		
}
