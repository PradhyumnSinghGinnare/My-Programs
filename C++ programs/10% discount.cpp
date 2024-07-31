#include<iostream>
using namespace std;
int main()
{
	int i,n;
	cout<<"Enter the prize:\n";
	cin>>i;
	if(i>=1000)
	{
		n=i*90/100;
		cout<<"You got 10% discount on your product!!!\n";
		cout<<"Now the prize of your product is : "<<n<<endl;
	}
	else
	{
		cout<<"Sorry! You got no discount..!";
	}
	return 0;
}
