#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10],str2[10];
	printf("\nEnter a string\n");
	scanf("%s",str1);
	strcpy(str2,str1);
	printf("\nCoping string is %s",str2);
	return 0;
}
