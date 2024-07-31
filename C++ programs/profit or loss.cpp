#include<iostream>
using namespace std;
int main()
{
	int cp,sp,result;
	cout<<"Enter the Cost Prize of the item :";
	cin>>cp;
	cout<<"Enter the Selling Prize of the item :";
	cin>>sp;
	result=sp-cp;
	if(result>0)
	   cout<<"You got Profit of Rs."<<result<<endl;
	else if(result<0)
	   cout<<"You got Loss of Rs."<<result<<endl;
	else
	   cout<<"No Profit...No Loss...!!!";
	return 0;
}
