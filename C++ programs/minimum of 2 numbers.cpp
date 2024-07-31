#include <iostream>
using namespace std;
int main()
{
int number1, number2, minimum;
cout<<"Enter first number: "; 
cin>>number1;
cout<<"Enter second number: ";
cin>>number2;
if(number1<number2)
{
minimum=number1;
}
else
{
minimum=number2;
}
cout<<"minimum number of the two number is: "<<minimum;
return 0;
}

