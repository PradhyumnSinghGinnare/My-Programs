#include<iostream>
using namespace std;
int main()
{
	int i,n,mul;
	cout<<"Enter the number:";
	cin>>n;
	cout<<"The numbers from 1 to "<<n<<" are:\n";
	for(i=1;i<=n;i++)
   {
	  cout<<i<<"\t";
	  mul=mul*i;
   }
   cout<<"\n\nThe multiplication from 1 to "<<n<<" are:"<<mul<<endl;
	return 0;
}
