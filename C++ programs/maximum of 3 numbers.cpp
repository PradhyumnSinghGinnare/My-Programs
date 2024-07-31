#include <iostream>
using namespace std;
int main() 
{
 float n1, n2, n3;
 cout << "Enter three numbers: ";
 cin >> n1 >> n2 >> n3;
 if((n1 >= n2) && (n1 >= n3))
 cout << "Maximum number: " << n1;
 else if ((n2 >= n1) && (n2 >= n3))
 cout << "Maximum number: " << n2;
 else
 cout << "Maximum number: " << n3; 
 return 0;
}
