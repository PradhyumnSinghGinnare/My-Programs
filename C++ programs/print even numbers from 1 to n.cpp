#include<iostream>
using namespace std;
int main()
{
	int i,n;
	cout<<"Enter the number:\n";
	cin>>n;
	cout<<"The numbers from 1 to "<<n<<" are:\n";
	for(i=1;i<=n;i++)
	  if(i%2 == 0)
	    cout<<i<<"\t";
	return 0;
}
