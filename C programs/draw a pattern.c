#include<stdio.h>
int main()
{
	int i,j,row;
	printf("Enter the nmber of rows :\n");
	scanf("%d",&row);
	
	for(i=0;i<=row;++i)
   {
	  for(j=1;j<=i;++j)
	  {
	    printf("PURU\t");
      }
      printf("\n\n");
   }
  return 0;	
}
