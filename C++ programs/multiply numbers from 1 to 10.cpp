#include<iostream>
using namespace std;
int main()
{
	int i,mul;
	cout<<"The first 10 natural numbers are:\n";
	for(i=1;i<=10;i++)
   {
	  cout<<i<<"\t";
	  mul=mul*i;
   }
    cout<<"\n\nThe multiplication of first 10 natural numbers are: "<<mul<<endl;
	return 0;
}
