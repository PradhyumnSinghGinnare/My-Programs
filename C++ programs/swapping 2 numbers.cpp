#include<iostream>
using namespace std;
int main()
{
	int num1,num2,temp;
	cout<<"Enter first number:";
	cin>>num1;
	cout<<"Enter second number:";
	cin>>num2;
	cout<<"\nBefore swapping first number: "<<num1<<"and second number: "<<num2<<endl;
	temp=num1;
	num1=num2;
	num2=temp;
	cout<<"\nAfter swapping first number: "<<num1<<"and second number: "<<num2<<endl;
	return 0;
}
