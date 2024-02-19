//Assuming we want to have the sum of (4 + 5i) and (8 + 2i)
#include <iostream>
using namespace std;

struct Complex {
    float real;
    float imaginary;
};

Complex addComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real + c2.real;
    result.imaginary = c1.imaginary + c2.imaginary;
    return result;
}

void writeComplex(Complex c) {
    if (c.imaginary >= 0)
        cout << c.real << " + " << c.imaginary << "i" << endl;
    else
        cout << c.real << " - " << -c.imaginary << "i" << endl;
}

int main() {
    Complex number1, number2, sum;

    cout << "Enter real part of first complex number: ";
    cin >> number1.real;
    cout << "Enter imaginary part of first complex number: ";
    cin >> number1.imaginary;

    cout << "Enter real part of second complex number: ";
    cin >> number2.real;
    cout << "Enter imaginary part of second complex number: ";
    cin >> number2.imaginary;

    sum = addComplex(number1, number2);

    cout << "Sum of the two complex numbers: ";
    writeComplex(sum);

    return 0;
}
