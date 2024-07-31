#include<iostream>
using namespace std;
int main()
{
	int i,n,sum=0;
	cout<<"Enter the number:";
	cin>>n;
	cout<<"The Even numbers from 1 to "<<n<<" are:\n";
	for(i=1;i<=n;i++)
	  if(i%2 == 0)
	   {
	      cout<<i<<"\t";
	      sum=sum+i;
       }
   cout<<"\n\nThe sum of even numbers from 1 to "<<n<<" are:"<<sum<<endl;
	return 0;
}
