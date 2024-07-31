#include<iostream>
#include<string>
using namespace std;
class student
{
private:
int id;
string name;
float eng,math,science;
float total;
float ctotal()
{ return eng+math+science;
}
public:
void Take_data()
{
cout<<"Enter Id number :";
cin>> id;
cout<<"Enter student name: " ;
cin>>name;
cout<< "Enter marks in english, math, science: ";
cin>>eng>>math>>science;
total=ctotal();
}
void Show_data()
{cout<<"ID number: "<<id<<"\nStudent name :"<<name<<"\nEnglish:"
<<eng<<"\nMath: "<<math<<"\nScience: "<<science<<"\nTotal: "<<total;
}
};
int main ()
{ student obj ;
obj.Take_data();
obj.Show_data();
return 0;
}

/*OUTPUT:
Enter Id number :98735
Enter student name: pradhyumn
Enter marks in english, math, science: 98
69
85
ID number: 98735
Student name :pradhyumn
English:98
Math: 69
Science: 85
Total: 252*/
