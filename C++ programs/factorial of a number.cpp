#include<iostream>
using namespace std;
int main()
{
 int i,f=1,num;
 cout<<"Input the number : ";
 cin>>num;
 for(i=1;i<=num;i++)
    f=f*i;
 cout<<"The Factorial of "<<num <<" is: "<<f<<"\n"<<endl;
 return 0;
}
