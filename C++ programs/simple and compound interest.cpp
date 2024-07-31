#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	float p,r,t,ci,si;
	cout<<"Enter Priciple, Rate and Time:\n";
	cin>>p>>r>>t;
	si=(p*r*t)/100;
	ci=p*pow((1+r/100),t);
	cout<<"\nSimple Interest:"<<si;
	cout<<"\nCompound Interest:"<<ci;
	return 0;
}
