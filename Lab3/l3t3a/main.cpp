//Assuming the imaginary number is "3 + 4i" (i => iota)"
#include <iostream>
using namespace std;

struct Complex {
    float real;
    float imaginary;
};

void readComplex(Complex &c) {
    cout << "Enter real part: ";
    cin >> c.real;
    cout << "Enter imaginary part: ";
    cin >> c.imaginary;
}

int main() {
    Complex number;

    cout << "Enter a complex number:" << endl;
    readComplex(number);

    cout << "Complex number entered: " << number.real << " + " << number.imaginary << "i" << endl;

    return 0;
}
