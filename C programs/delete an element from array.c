#include<stdio.h>
int main()
{
	int a[50],n,pos,i;
	printf("Enter number of elements in array\n");
	scanf("%d",&n);
	printf("\nEnter %d array elements\n",n);
	for(i=0;i<n;i++)
	   scanf("%d",&a[i]);
	printf("\nEnter the position from where to delete\n");
	scanf("%d",&pos);
	for(i=pos;i<n;i++)
	   a[i]=a[i+1];
	n--;
	printf("\nNew array elements are\n");
	for(i=0;i<n;i++)
	   printf("%d\t",a[i]);
	return 0;
}
