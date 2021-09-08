//1.craete a array of 3 elements and pass it to the function display .To display the elements of an array.

int main()
{
	//intializing the array elements and function display.
	int arr[3] = {1,2,3};
	display(arr);//passing array to function.
	
}
    //creating function display and passing parameter to it.
    void display(int arr[])//parameter is array.
    {
    	printf("\n arr[0] = %d",arr[0]);
    	printf("\n arr[1] = %d",arr[1]);
    	printf("\n arr[2] = %d",arr[2]);
    	
	}
   
	

