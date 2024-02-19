#include <iostream>

using namespace std;

struct Distance{
    int feet;
    int inch;
};

int main()
{
    Distance distances[2];
    distances[1] = {45,8};
    distances[2] = {12,5};
    cout << "The first distance is " << distances[1].feet << "feet and " << distances[1].inch << "inches" << endl;
    cout << "\nThe second distance is " << distances[2].feet << "feet and " << distances[2].inch << "inches" << endl;

    return 0;
}
