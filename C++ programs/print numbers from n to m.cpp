#include<iostream>
using namespace std;
int main()
{
	int i,n,m;
	cout<<"Enter the number from where you want to strat:\n";
	cin>>n;
	cout<<"Enter the number where you want to end:\n";
	cin>>m;
	cout<<"The numbers from "<<n<<" to "<<m<<" are:\n";
	for(i=n; i<=m ;i++)
	  cout<<i<<"\t";
	return 0;
}
