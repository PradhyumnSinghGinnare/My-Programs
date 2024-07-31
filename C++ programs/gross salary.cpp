#include<iostream>
using namespace std;
int main()
{
	float bs,gs,hra,da;
	cout<<"Enter the basic salary of employee:";
	cin>>bs;
	if(bs<1500)
	{
		hra=0.1*bs;
		da=0.9*bs;
	}
	else
	{
		hra=500;
		da=0.98*bs;
	}
	gs=bs+hra+da;
	cout<<"Gross Salary is:"<<gs;
	return 0;
}
