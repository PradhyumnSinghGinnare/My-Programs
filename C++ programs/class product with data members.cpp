#include <iostream>
using namespace std;

class Product
{
	private:
		int id,price,qty;
		char i_name[20];
		static int cnt;
	public:
        void getdata()
    {    
	cout<<"\nEnter Product Id:\t\t";
    cin>>id;
	cout<<"\nEnter Product Name:\t\t";
	cin>>i_name;
	cout<<"\nEnter Product Price:\t\t";
	cin>>price;
	cout<<"\nEnter Product qty:\t\t";
	cin>>qty;
	cnt++;
    }
void diplay()
{
	cout<<"\nProduct Id = \t"<<id;
	cout<<"\nProduct Name = \t"<<i_name;
	cout<<"\nProduct Price = \t"<<price;
	cout<<"\nProduct Qty = \t"<<qty;
}
static void nob()
{
	cout<<"\nNumber of object created for class are :\t"<<cnt;
}
};

int Product::cnt;
int main()
{
	Product ob[10];
	int n;
	cout<<"\nEnter How many item:";
	cin>>n;
	for(int i=0;i<n;i++)
	ob[i].getdata();
	for(int i=0;i<n;i++)
	ob[i].diplay();
	ob[n-1].nob();
	return 0;
}
/*Output:

Enter How many item:2
Enter Product Id:       72197
Enter Product Name:     santoor
Enter Product Price:    20
Enter Product qty:      4
Enter Product Id:       86238
Enter Product Name:     pen
Enter Product Price:    10
Enter Product qty:      5

Product Id =    72197
Product Name =  santoor
Product Price =         20
Product Qty =   4
Product Id =    86238
Product Name =  pen
Product Price =         10
Product Qty =   5
Number of object created for class are :        2*/
