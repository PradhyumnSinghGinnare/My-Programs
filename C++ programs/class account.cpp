#include<iostream>
using namespace std;

class Account
{
long int accno, bal;
char name[10];

public:
   void getdata()
   {
     cout<<"\nEnter account number, balance and name ";
     cin>>accno>>bal>>name;
   }
void putdata()
   {
     if(bal>10000)
       {
         cout<<"\nThe Account Number is "<<accno;
         cout<<"\nThe Balance is "<<bal;
         cout<<"\nThe Name is "<<name;
       }
   }
};

int main()
{
  Account a[5];
  int i;

  for(i=0;i<5;i++)
     a[i].getdata();
  for(i=0;i<5;i++)
     a[i].putdata();
  return 0;
}
/*OUTPUT:
Enter account number, balance and name 98634982
98694
pradhyumn

Enter account number, balance and name 89284698
87563
shashank

Enter account number, balance and name 34827637
72458
mayank

Enter account number, balance and name 42196498
42197
shivam

Enter account number, balance and name 82419862
21624
kuldeep

The Account Number is 98634982
The Balance is 98694
The Name is pradhyumn
The Account Number is 89284698
The Balance is 87563
The Name is shashank
The Account Number is 34827637
The Balance is 72458
The Name is mayank
The Account Number is 42196498
The Balance is 42197
The Name is shivam
The Account Number is 82419862
The Balance is 21624
The Name is kuldeep*/
