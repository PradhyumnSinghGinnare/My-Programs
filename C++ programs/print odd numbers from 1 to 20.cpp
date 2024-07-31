#include<iostream>
using namespace std;
int main()
{
	int i;
	cout<<"Odd numbers from 1 to 20 are:\n";
	for(i=1;i<=20;i++)
	  if(i%2 != 0)
	    cout<<i<<"\t";
	    
	return 0;
}
