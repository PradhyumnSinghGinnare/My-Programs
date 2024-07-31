#include<stdio.h>
#define MAX 50
int num[MAX];
int main()
{
	int n,i,key=0,flag;
	printf("Enter number of elements in array:\n");
	scanf("%d",&n);
	printf("\nEnter %d array elements\n",n);
	for(i=0;i<n;i++)
	  scanf("%d",&num[i]);
	printf("\nEnter the value to be searched\n");
	scanf("%d",&key);
	for(i=0;i<n;i++)
	{
		if(num[i]==key)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	  printf("\n%d found in the array",key);
	else
	  printf("\nElement not found");
	return 0;
}
