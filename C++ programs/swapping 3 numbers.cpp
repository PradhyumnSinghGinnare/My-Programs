#include<iostream>
using namespace std;
int main()
{
	int n1,n2,n3,n4;
	cout<<"Enter three numbers:";
	cin>>n1>>n2>>n3;
	n4=n1;
	n1=n2;
	n2=n3;
	n3=n4;
	cout<<"values after swapping:";
	cout<<n1<<"\t"<<n2<<"\t"<<n3<<endl;
	return 0;
}
