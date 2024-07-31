#include <iostream>
using namespace std;
int main()
{
 int a, b, c;
 cout << "Enter three numbers \n";
 cin >> a >> b >> c;
 if (a < b && a < c) 
 {
 cout << "Minimum number is " << a;
 } 
 else if (b < a && b < c) 
 {
 cout << "Minimum number is " << b;
 } 
 else 
 {
 cout << "Minimum number is "<< c;
 }
 return 0;
}

