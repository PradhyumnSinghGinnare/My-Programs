#include<iostream>
using namespace std;
int main()
{
	int n1,n2,n3,n4,n5,total,div;
	float per;
	cout<<"Enter the Mark's of 5 subjects :\n";
	cin>>n1>>n2>>n3>>n4>>n5;
	total=n1+n2+n3+n4+n5;
	cout<<"Total Mark's "<<total<<endl;
	per=total/5;
	cout<<"Percentage :"<<per<<"%"<<endl;
	if(per>=60)
	   cout<<"Congratulations..!! You got First Division...!"<<endl;
	else if(per>=50)
	    cout<<"Congratutions..!! You got Second Division...!"<<endl;
	else if(per>=40)
	    cout<<"Congratutions..!! You got Third Division...!"<<endl;
	else
	   cout<<"Fail..!!! Better luck next time...!"<<endl;
	return 0;
}
