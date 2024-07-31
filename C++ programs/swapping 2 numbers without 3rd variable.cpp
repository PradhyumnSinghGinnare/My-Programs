#include<iostream>
using namespace std;
int main()
{
	int a=45,b=70;
	cout<<"Before swap a:"<<a<<"\tb:"<<b<<endl;
	a=a*b;
	b=a/b;
	a=a/b;
	cout<<"After swapping a:"<<a<<"\tb:"<<b<<endl;
	return 0;
}
