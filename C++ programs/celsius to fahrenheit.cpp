#include<iostream>
using namespace std;
int main()
{
	float frh,cel;
	cout<<"\n\nConvert temperature in Celsius to Fahrenheit:\n";
	cout<<"--------------------------------------------------\n";
	cout<<"Input the temperature in celsius :"<<endl;
	cin>>cel;
	frh=(cel*9.0/5.0)+32;
	cout<<"The temperature in Celsius :"<<cel<<endl;
	cout<<"The temperature in Fahrenheit :"<<frh<<endl;
	return 0;
}
