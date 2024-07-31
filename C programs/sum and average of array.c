#include<stdio.h>
#define MAX 50
int num[MAX];
int main()
{
	int n,i,sum=0;
	float avg=0.0;
	printf("Enter number of elements in array\n");
	scanf("%d",&n);
	printf("\nEnter %d array elements\n",n);
	for(i=0;i<n;i++)
	  scanf("%d",&num[i]);
	for(i=0;i<n;i++)
	  sum=sum+num[i];
	printf("\nSum of array elements is %d",sum);
	avg=(float)sum/n;
	printf("\nAverage = %.2f",avg);
	return 0;
}
