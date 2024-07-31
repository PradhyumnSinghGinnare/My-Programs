#include<iostream>
using namespace std;
int main()
{
	float cel,frh;
	cout<<"\n\nConvert temperature in Fahrenheit to celsius :\n";
	cout<<"---------------------------------------------------\n";
	cout<<"Input the temperature in Fahrenheit :"<<endl;
	cin>>frh;
	cel=(frh-32)*5.0/9.0;
	cout<<"The temperature in Fahrenheit :"<<frh<<endl;
	cout<<"The temperature in Celsius :"<<cel<<endl;
	return 0;
}
