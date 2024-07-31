#include <iostream>
using namespace std;
 
#define MAX 10
 
class user
{
    private:
        char  name[30];
        int   deposit;
    public:
        int getDetails(void);
        int putDetails(void);
};
 
//member function definition, outside of the class
int user::getDetails(void)
{
    cout << "Enter name: " ;
    cin >> name;
    cout << "Enter Deposit amount: ";
    cin >> deposit;
    return 0;
}
 
//member function definition, outside of the class
int user::putDetails(void){
    cout << "User's' details:\n";
    cout << "Name:"<< name << ",Deposit :" << deposit;
    return 0;
}
 
int main()
{
    user std[6];       //array of objects creation
    int loop;
    
    for(loop=0;loop< 6; loop++)
	{
        cout << "Enter details of User " << loop+1 << ":\n";
        std[loop].getDetails();
    }
     
    cout << endl;
     
    for(loop=0;loop< 6; loop++){
        cout << "Details of User " << (loop+1) << ":\n";
        std[loop].putDetails();
    }
     
    return 0;
}
/*OUTPUT:
Enter details of User 1:
Enter name: pradhyumn
Enter Deposit amount: 99754
Enter details of User 2:
Enter name: aman
Enter Deposit amount: 98435
Enter details of User 3:
Enter name: yash
Enter Deposit amount: 87952
Enter details of User 4:
Enter name: mayank
Enter Deposit amount: 54798
Enter details of User 5:
Enter name: aayush
Enter Deposit amount: 35280
Enter details of User 6:
Enter name: kartik
Enter Deposit amount: 98493

Details of User 1:
User's' details:
Name:pradhyumn,Deposit :99754
Details of User 2:
User's' details:
Name:aman,Deposit :98435
Details of User 3:
User's' details:
Name:yash,Deposit :87952
Details of User 4:
User's' details:
Name:mayank,Deposit :54798
Details of User 5:
User's' details:
Name:aayush,Deposit :35280
Details of User 6:
User's' details:
Name:kartik,Deposit :98493*/
