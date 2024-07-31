#include<iostream>
using namespace std;
int main()
{
	int i,sum=0;
	cout<<"Even numbers from 1 to 10 are:\n";
	for(i=1;i<=10;i++)
	  if(i%2 == 0)
	   {
	      cout<<i<<"\t";
	      sum=sum+i;
       }
    cout<<"\n\nThe sum of even numbers from 1 to 10 are: "<<sum<<endl;
	return 0;
}
