#include<iostream>
#include<stdio.h>
using namespace std;
class TEST
{
  private:
	int TestCode;
	char Description[30];
	int NoCandidate;
	int CenterReqd;
	int CALCNTR()
	{
		return NoCandidate/100+1;
	}
  public:
	void SCHDULE();
	void DISPTEST();
};
void TEST::SCHDULE()
{
	cout<<"Enter Test code ";
	cin>> TestCode;
	cout<<"Enter description ";
	gets(Description);
	cout<< "Enter no of candidates ";
	cin>>NoCandidate;
	CenterReqd=CALCNTR();
}
void TEST :: DISPTEST()
{
	cout<<"Test code "<<TestCode<<"\nDescripton "<<Description<<"\nNo of candidate "
	<<NoCandidate<<"\nCenter required "<<CenterReqd;
}
int main ()
{
	TEST obj;
	obj.SCHDULE();
	obj.DISPTEST();
	return 0;
}
/*OUTPUT:
Enter Test code 7546
Enter description Enter no of candidates 10
Test code 7546
Descripton
No of candidate 10
Center required 1*/
