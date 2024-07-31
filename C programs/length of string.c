#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10];
	int len=0;
	printf("\nEnter a string\n");
	scanf("%s",str1);
	len=strlen(str1);
	printf("\nLength of string is %d",len);
	return 0;
}
