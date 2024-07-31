#include<stdio.h>
int main()
{
	int a[5]={2,9,11,13,57};
	int b[5]={1,3,17,25,90};
	int c[10],i,j,k;
	printf("\nArray A\n");
	for(i=0;i<5;i++)
	  printf("%d\t",a[i]);
	printf("\nArray B\n");
	for(i=0;i<5;i++)
	  printf("%d\t",b[i]);
	
	/*merging the two arrays*/
	for(i=j=k=0;i<=9;)
	{
		if(a[j]<=b[k])
		  c[i++]=a[j++];
		else
		  c[i++]=b[k++];
		if(j==5||k==5)
		  break;
	}
	for(;j<5;)
	  c[i++]=a[j++];
	for(;k<5;)
	  c[i++]=b[k++];
	
	printf("\nArray after sorting\n");
	for(i=0;i<10;i++)
	  printf("%5d",c[i]);
	return 0;
}
