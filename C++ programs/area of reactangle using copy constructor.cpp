#include<iostream>
using namespace std;

class Test {
public:
    int length, width, area;

    void input() {
        cout << "Enter length of rectangle:";
        cin >> length;
        cout << "Enter width of rectangle:";
        cin>>width;
    }

    void findArea() {
        area = length * width;
    }

    void display() {
        cout << "Area of rectangle is:" << area;
    }
};

int main() {

    Test obj;

    obj.input();
    obj.findArea();
    obj.display();

    return 0;
}
/*Output:
Enter length of rectangle:12
Enter width of rectangle:2
Area of rectangle is:24*/
