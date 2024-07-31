#include<iostream>
using namespace std;
int main()
{
  int x=4, y=2;
  switch (x) 
   {  
      // If x == 1
      case 1:
      switch (y) 
	   {
          // If y == 2
          case 2:
              cout << "Choice is 2";
              break;
          // If y == 3
          case 3:
              cout << "Choice is 3";
              break;
       }
      break;
     // If x == 4
      case 4:
          cout << "Choice is 4";
          break;
     // If x == 5
      case 5: 
	      cout << "Choice is 5";
          break;
      default:
          cout << "Choice is other than 1, 2, 3, 4, or 5";
          break;
   }
  return 0;
}
