#include<iostream>
using namespace std;
int main()
{
	int i,mul;
	cout<<"Even numbers from 1 to 10 are:\n";
	for(i=1;i<=10;i++)
	  if(i%2 == 0)
	   {
	      cout<<i<<"\t";
	      mul=mul*i;
       }
    cout<<"\n\nThe multiplication of even numbers from 1 to 10 are: "<<mul<<endl;
	return 0;
}
