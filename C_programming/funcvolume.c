//28.create a function to calculate volume of a box.
int calculate_volume(int l,int w,int h)
{
	return(l*w*h);
	
}	
int main()
  {
  	int l,w,h;
  	float v;
  	printf("\n enter a box length :");
  	scanf("%d",&l);
  	
  	printf("\n enter a box width :");
  	scanf("%d",&w);
  	
  	printf("\n enter a box height :");
  	scanf("%d",&h);
  	
  	v=calculate_volume(l,w,h);
  	printf("\n Volume of a box is:%.2f",v);
  	
}																						
