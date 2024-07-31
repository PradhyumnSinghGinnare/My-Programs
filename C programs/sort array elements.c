#include<stdio.h>
#define MAX 50
int main()
{
	int arr[MAX],i,j,n,temp=0;
	printf("\nEnter number of elements in array\n");
	scanf("%d",&n);
	printf("\nEnter %d array elements\n",n);
	for(i=0;i<n;i++)
	  scanf("%d",&arr[i]);
	printf("\nUnsorted array\n");
	for(i=0;i<n;i++)
	  printf("%d\t",arr[i]);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	printf("\nSorting array is\n");
	for(i=0;i<n;i++)
	  printf("%d\t",arr[i]);
	return 0;
}
