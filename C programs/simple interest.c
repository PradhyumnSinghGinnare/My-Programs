#include<stdio.h>
int main()
{
	float principle,time,rate,si;
	printf("Enter principle (amount) :");
	scanf("%f",&principle);
	printf("\nEnter time :");
	scanf("%f",&time);
	printf("\nEnter rate :");
	scanf("%f",&rate);
	si=(principle*time*rate)/100;
	printf("Simple Interest : %f",si);
	return 0;
}
