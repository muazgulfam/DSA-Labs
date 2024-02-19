//Assuming we want to have the product of (4 + 5i) and (8 + 2i)
#include <iostream>
using namespace std;

// Define the structure for complex number
struct Complex {
    float real;
    float imaginary;
};

// Function to multiply two complex numbers
Complex multiplyComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
    result.imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
    return result;
}

// Function to write a complex number
void writeComplex(Complex c) {
    if (c.imaginary >= 0)
        cout << c.real << " + " << c.imaginary << "i" << endl;
    else
        cout << c.real << " - " << -c.imaginary << "i" << endl;
}

int main() {
    Complex number1, number2, product;

    // Input the first complex number
    cout << "Enter real part of first complex number: ";
    cin >> number1.real;
    cout << "Enter imaginary part of first complex number: ";
    cin >> number1.imaginary;

    // Input the second complex number
    cout << "Enter real part of second complex number: ";
    cin >> number2.real;
    cout << "Enter imaginary part of second complex number: ";
    cin >> number2.imaginary;

    // Multiply the two complex numbers
    product = multiplyComplex(number1, number2);

    // Display the product
    cout << "Product of the two complex numbers: ";
    writeComplex(product);

    return 0;
}
