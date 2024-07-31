#include<stdio.h>
#define MAX 50
int number[MAX];
int main()
{
	int n,i,mul=0;
	printf("\nEnter number of elements in array\n");
	scanf("%d",&n);
	printf("\nEnter %d elements in array\n",n);
	for(i=0;i<n;i++)
	   scanf("%d",&number[i]);
	printf("\nEntered array elements are\n");
	for(i=0;i<n;i++)
	   printf("%d\t",number[i]);
	printf("\nEnter the multiplier\n");
	scanf("%d",&mul);
	for(i=0;i<n;i++)
	   number[i]=number[i]*mul;
	printf("\nUpdated array\n");
	for(i=0;i<n;i++)
	   printf("%d\t",number[i]);
	return 0;
}
