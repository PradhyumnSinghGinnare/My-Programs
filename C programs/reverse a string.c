#include<stdio.h>
#include<string.h>
int main()
{
	char str[10],rev[10];
	int i,len=0,j=0;
	printf("\nEnter a string\n");
	scanf("%s",str);
	printf("\nEntered string = %s\n",str);
	len=strlen(str);
	for(i=len-1;i>=0;i--)
	  rev[j++]=str[i];
	rev[j]='\0';
	printf("\nReversed string = %s",rev);
	return 0;
}
