#include <iostream>

using namespace std;
struct company{
    string name;
    string address;
    string phoneNumber;
    int noOfEmpoyee;
};

int main()
{
    company companies[5];
    companies[1] = {"10Pearls", "PECHS, Karachi", "03123456789", 1200};
    companies[2] = {"Systems Limited", "Muhammad Ali Society, Karachi", "03135791113", 5200};
    companies[3] = {"Netsol", "PECHS, Karachi", "03024681011", 1100};
    companies[4] = {"Afinity", "Shah Faisal, Karachi", "03987654321", 2100};
    companies[5] = {"Gaditech", "PECHS, Karachi", "03123789456", 520};
    for(int i = 1; i <= 5; i++){
        cout << "Name of the Company: " << companies[i].name << endl;
        cout << "Address of the Company: " << companies[i].address << endl;
        cout << "Contact number of the Company: " << companies[i].phoneNumber << endl;
        cout << "Number of employee in the Company: " << companies[i].noOfEmpoyee << endl;
        cout << "\n" << endl;
    }
    return 0;
}
