#include <iostream>
#include <string>
using namespace std;

// int add ( int a, int b ) {
//     cout << "The sum is " << a + b;
// }

class Employees
{
public:
    string name;
    int salary;

    //     Employees (string n, int s, int sp) {
    //         this->name = n;
    //         this->salary = s;
    //         this->secretPass = sp;
    //     }

    //     void printDetails() {
    //         cout << "The Name is " << this->name << endl;
    //         cout << "The Salary is " << this->salary << endl;
    //     }

    //     void getSecretPass() {
    //         cout << "The secret Password is " << this->secretPass;
    //     }

    // private:
    //     int secretPass;
};

class Programmer : public Employees
{
public:
    int errors;
    void printDetails()
    {
        cout << "The Name is " << this->name << endl;
        cout << "The Salary is " << this->salary << endl;
        cout << "The Errors are " << this->errors;
    }
};

int main()
{
    // cout

    // cout << "I Miss You Sehar" << endl;
    // cout << "I Miss You Haleema";

    // Datatypes

    // string name = "Sehar";
    // cout << name;

    // int a, b, c;
    // a = 25, b = 5;
    // c = a * b;
    // cout << c;
    // return 0;

    // camelCase

    // int marksInStats = 67;
    // cout << "The Marks of Student in Stats are " << marksInStats << " Done" << endl << "Hello g";
    // return 0;

    // short b;
    // int a;
    // long c;
    // long long d;

    // float const num1 = 55.5;

    // double num2 = 55.555555;
    // cout << "The Number 2 is " << num2 << endl;

    // long double num3 = 87.098656467899668;
    // cout << "The Number 3 is " << num3 << endl;

    // cout << "The Number 1 is " << num1;

    // int a = 25, b = 35;
    // int const c = 75;
    // a = 45;
    // b = 55;
    // cout << a << " " << b << " " << c;

    // cin

    // float num1, num2, sum;
    // cout << "Enter first Number: ";
    // cin >> num1;

    // cout << "Enter second Number: ";
    // cin >> num2;
    // cout << "The sum is " << num1 + num2 << endl ;
    // cout << "The difference is " << num1 - num2 << endl;
    // cout << "The multiplication is " << num1 * num2 << endl;
    // cout << "The division is " << num1 / num2 << endl;

    // if-else

    // int num1 = 45, num2 = 45;
    // num2 = 75;
    // num1 = 99;
    // if ( num1 > num2 ) {
    //     cout << "Number 1 greater than Number 2";
    // }
    // else if ( num1 < num2 ) {
    //     cout << "Number 2 greater than Number 1";
    // }
    // else {
    //     cout << "Both are Equal";
    // }

    // int age;
    // cout << "Enter Your Age: ";
    // cin >> age;

    // if ( age >= 18 ) {
    //     cout << "Eligible";
    // } else {
    //     cout << "Not Eligible";
    // }

    // int age;
    // string passport;

    // cout << "Enter your age: ";
    // cin >> age;

    // cout << "Do You have a Passport? ";
    // cin >> passport;

    // if ( age >= 18 && passport == "Yes" ) {
    //     cout << "You can travel" << endl << endl;
    // } else {
    //     cout << "You cannot travel" << endl << endl;
    // }

    // string coffee, tea;
    // cout << "What do you wanna drink?" << endl;

    // cout << "You wanna have coffee? ";
    // cin >> coffee;

    // cout << "You wanna have tea? ";
    // cin >> tea;

    // if ( coffee == "Yes" || tea == "Yes" ) {
    //     cout << "Order successful";
    // } else {
    //     cout << "Order isn't successful";
    // }

    // Switch

    // int day;
    // cout << "What's the day today? ";
    // cin >> day;

    // switch (day) {
    // case 1:
    //     cout << "Working Day";
    //     break;
    // case 2:
    //     cout << "Working Day";
    //     break;
    // case 3:
    //     cout << "Working Day";
    //     break;
    // case 4:
    //     cout << "Working Day";
    //     break;
    // case 5:
    //     cout << "Working Day";
    //     break;
    // case 6:
    //     cout << "Working Day";
    //     break;

    // default:
    //     cout << "It's a Holiday!!";
    //     break;
    // }
    // return 0;

    // Loops

    // int i = 1;
    // while ( i < 11 ) {
    //     cout << i << " ";
    //     i++;
    // }

    // int i = 1;
    // do {
    //     cout << i << " ";
    //     i++;
    // }
    // while ( i < 11 );

    // int j;
    // cout << "Enter a number: ";
    // cin >> j;

    // for ( int i = 1; i < 11; i++ ) {
    //     cout << j << "*" << i << "=" << j*i << endl;
    // }

    // int index = 0;
    // while ( index < 10 ) {
    //     cout << "We are at index " << index << endl;
    //     index++;
    // }
    // cout << index;

    // int index = 0;
    // do {
    //     cout << "We are at index " << index << endl;
    //     index++;
    // } while ( index < -1 );

    // for ( int index = 0; index <= 10; index++ ) {
    //     cout << "We are at index " << index << endl;
    // }

    // add (10, 20);
    // cout << "Hello World";

    // int a = 555;
    // cout << (float) a/4;

    // float b = 35.78;
    // cout << (int) b*3;

    // string name = "Sehar Amaz";
    // cout << name << endl;
    // cout << name.length() << endl;
    // cout << name.substr(6,10);

    // Pointers
    // int a = 5;
    // int *ptra;
    // ptra = &a;
    // cout << "The value of a is " << a << endl;
    // cout << "The value of a is " << *ptra << endl;
    // cout << "The address of a is " << ptra << endl;
    // cout << "The address of a is " << &a;

    // int age = 18;
    // int *a;
    // a = &age;
    // cout << *a;

    // char ch = 'm';
    // char *c;
    // c = &ch;
    // cout << *c;

    // Employees a;
    // a.name = "John";
    // a.salary = 90000;
    // a.printDetails();

    // Employees a("John", 90000, 2792004);
    // a.printDetails();
    // a.getSecretPass();

    Programmer b;
    b.name = "Jack";
    b.salary = 75000;
    b.errors = 9;
    b.printDetails();
}