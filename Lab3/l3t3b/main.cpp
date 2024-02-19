//Assuming the imaginary number is 4 - 8i (i => iota)
#include <iostream>
using namespace std;

struct Complex {
    float real;
    float imaginary;
};

void writeComplex(Complex c) {
    if (c.imaginary >= 0)
        cout << c.real << " + " << c.imaginary << "i" << endl;
    else
        cout << c.real << " - " << -c.imaginary << "i" << endl;
}

int main() {
    Complex number;

    cout << "Enter real part: ";
    cin >> number.real;
    cout << "Enter imaginary part: ";
    cin >> number.imaginary;

    cout << "Complex number entered: ";
    writeComplex(number);

    return 0;
}
