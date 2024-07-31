#include<stdio.h>
int main()
{
	int number[10],i;
	printf("\nEnter 10 array elements\n");
	for(i=0;i<10;++i)
	   scanf("%d\n",&number[i]);
	printf("\nEntered array elements are:\n");
	for(i=0;i<10;++i)
	   printf("\n%p\t number[%d]=%d\t",&number[i],i,number[i]);
	return 0;
}
