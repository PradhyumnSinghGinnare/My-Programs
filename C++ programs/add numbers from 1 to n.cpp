#include<iostream>
using namespace std;
int main()
{
	int i,n,sum=0;
	cout<<"Enter the number:";
	cin>>n;
	cout<<"The numbers from 1 to "<<n<<" are:\n";
	for(i=1;i<=n;i++)
   {
	  cout<<i<<"\t";
	  sum=sum+i;
   }
   cout<<"\n\nThe sum of "<<n<<" natural numbers are:"<<sum<<endl;
	return 0;
}
