#include<iostream>
using namespace std;
int main()
{
	int i;
	cout<<"\nThe ASCII values of all the Characters are:\n";
	for(i=0;i<=255;i++)
	{
		cout<<"ASCII value of Character "<<(char)i<<"="<<i<<endl;
	}
	return 0;
}
