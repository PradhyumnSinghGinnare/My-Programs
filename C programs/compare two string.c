#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10],str2[10];
	printf("\nEnter a string\n");
	scanf("%s",str1);
	printf("\nEnter another string\n");
	scanf("%s",str2);
	if(strcmp(str1,str2)==0)
	  printf("\nString are identical\n");
	else if(strcmp(str1,str2)<0)
	       printf("%s is smaller",str1);
	    else
	       printf("%s is smaller",str2);
	return 0;
}
