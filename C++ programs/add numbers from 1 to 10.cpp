#include<iostream>
using namespace std;
int main()
{
	int i,sum=0;
	cout<<"The first 10 natural numbers are:\n";
	for(i=1;i<=10;i++)
   {
	  cout<<i<<"\t";
	  sum=sum+i;
   }
   cout<<"\n\nThe sum of first 10 natural numbers are:"<<sum<<endl;
	return 0;
}
