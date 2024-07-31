#include<stdio.h>
#define MAX 50
int num[MAX];
int big(int[],int);
int main()
{
	int n,i,max=0;
	printf("Enter number of elements in array\n");
	scanf("%d",&n);
	printf("\nEnter %d array elements\n",n);
	for(i=0;i<n;i++)
	  scanf("%d",&num[i]);
	max=big(num,n);
	printf("\nLargest element is %d",max);
	return 0;
}
int big(int a[],int m)
{
	int largest=0,i;
	for(i=0;i<m;i++)
	{
		if(largest<a[i]);
		largest=a[i];
	}
	return(largest);
}
