#include<iostream>
using namespace std;
int main()
{
	int i,n,x;
	cout<<"Enter the current year:";
	cin>>i;
	cout<<"Enter the year in which the you joined the organization:";
	cin>>n;
	if(n<=(i-3))
	   cout<<"Congratulations!!! You got Bonus of Rs. 2500/-";
	else
	   cout<<"Sorry!!! Better luck next time..!!!";
	return 0;
}
