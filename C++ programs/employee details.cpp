#include <iostream>
using namespace std;
 
struct Employee {
    char name[50];
    int salary;
    int employeeCode;
    char dept[5];
};
 
int main() {
    Employee e;
     
    cout << "Enter name of employee : ";
    cin.getline(e.name, 50);
    cout << "Enter department : ";
    cin.getline(e.dept, 5);
    cout << "Enter salary of employee : ";
    cin >> e.salary;
    cout << "Enter employee code : ";
    cin >> e.employeeCode;
     
    // Printing employee details 
    cout << "\n*** Employee Details ***" << endl;
    cout << "Name : " << e.name << endl << "Salary : " << e.salary << endl;
    cout << "Employee Code : " << e.employeeCode << endl << "Department : " << e.dept;
    return 0;
}
/*Output:
Enter name of employee : Jason Donald
Enter department : CSE
Enter salary of employee : 53463
Enter employee code : 1234

*** Employee Details ***
Name : Jason Donald
Salary : 53463
Employee Code : 1234
Department : CSE*/
