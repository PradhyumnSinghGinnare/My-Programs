#include <iostream>
using namespace std;
float si(int p, int n, int r=5)
{
	return (p*n*r)/100;
}
int main()
{
	int p, n, r;
	cout<<"Enter principal amount: ";
	cin>>p;
	cout<<"Enter duration (in years): ";
	cin>>n;
	cout<<"Enter rate of interest: ";
	cin>>r;
	cout<<"Simple interest = "<<si(p, n, r);
	cout<<"Simple interest = "<<si(p, n);
	return 0;
}

/*Output:
Enter principal amount: 10000
Enter duration (in years): 5
Enter rate of interest: 10
Simple interest = 5000
Simple interest = 2500*/
