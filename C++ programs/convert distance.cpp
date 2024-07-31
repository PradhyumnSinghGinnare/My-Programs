#include <iostream>
using namespace std;
int main() 
{
    float km, m, feet, inch, cm,yard;
	cout << "Enter the distance (in km) : ";
	cin >> km;
	m = km * 1000;  // 1km = 1000m
	feet = km*3280.84;  // 1km=3280.84feet
	inch = km*39370.1;  //1 km=39370.1inches
	cm = km * 100000;  //1km = 100000cm
	yard = km * 1093.61;  // 1km=1093.61yard
	cout << "\nDistance in Kilometres = " << km;
	cout << "\nDistance in Metres = " << m;
	cout << "\nDistance in Feet = " << feet;
	cout << "\nDistance in Inches =  " << inch;
	cout << "\nDistance in Centimetres =  " << cm;
	cout << "\nDistance in Yards = " << yard;
    return 0;
}

/*Output:
Enter the distance between two cities(in km) – 20
Distance in kilometres = 20.000000
Distance in metres = 20000.000000
Distance in feet = 65616.796875
Distance in inches = 787402.000000
Distance in centimetres = 2000000.000000*/
