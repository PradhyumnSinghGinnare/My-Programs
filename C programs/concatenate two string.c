#include<stdio.h>
#include<string.h>
int main()
{
	char str1[10],str2[10],str3[20];
	printf("\nEnter first string\n");
	scanf("%s",str1);
	printf("\nEnter second string\n");
	scanf("%s",str2);
	strcpy(str3,strcat(str1,str2));
	printf("\nConcatenated string is %s",str3);
	return 0;
}
