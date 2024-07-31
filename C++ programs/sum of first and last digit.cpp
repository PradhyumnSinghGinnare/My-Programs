#include <iostream>
using namespace std;

int main()
{
   int n,first,last,sum;
    cout << "\n\n Find the sum of first and last digit of a number:\n";
    cout << "------------------------------------------------------\n";
    cout << " Input any number: ";
    cin >> n;
    first = n;
	last=n % 10;
	for(first=n;first>=10;first=first/10);
    cout<<" The first digit of "<<n<<" is: "<<first<<endl;
    cout<<" The last digit of "<<n<<" is: "<<last<<endl;
	cout<<" The sum of first and last digit of "<<n<<" is: "<<first+last<<endl;
	return 0;
}
