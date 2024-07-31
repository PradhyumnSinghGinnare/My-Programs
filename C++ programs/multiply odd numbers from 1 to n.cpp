#include<iostream>
using namespace std;
int main()
{
	int i,n,mul;
	cout<<"Enter the number:";
	cin>>n;
	cout<<"The Odd numbers from 1 to "<<n<<" are:\n";
	for(i=1;i<=n;i++)
	  if(i%2 != 0)
	   {
	      cout<<i<<"\t";
	      mul=mul*i;
       }
   cout<<"\n\nThe multiplication of odd numbers from 1 to "<<n<<" are:"<<mul<<endl;
	return 0;
}
