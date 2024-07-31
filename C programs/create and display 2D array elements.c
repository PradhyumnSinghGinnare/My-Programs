#include<stdio.h>
int main()
{
	int num[3][3],i,j;
	printf("\nEnter elements for 3x3 matrix\n");
	for(i=0;i<3;i++)
	{
	  for(j=0;j<3;j++)
	    scanf("%d",&num[i][j]);
    }
	printf("\nMatrix\n");
	for(i=0;i<3;i++)
	{
	  for(j=0;j<3;j++)
	    printf("%d\t",num[i][j]);
	  printf("\n");
    }
    return 0;
}
