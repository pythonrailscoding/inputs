/* Include these headers for modern C++ IDE's like Dev-C++
#include <iostream>
using namespace std;
int main()
*/

//Use This header for Turbo-C++
#include <iostream.h>
#include <conio.h>
//Using any editor, invoke this  method
int sum(int a, int b){
	int c;
	c = a + b;
	return c;
}
int main(){
	int a, b;
	cout <<  "Enter a number";
	cin >> a;
	cout << "Enter another number";
	cin >> b;
	cout << "The sum of " << a << " and " << b << " is " << sum(a, b);
	//Include this statement for Turbo-C++
	getch();
	return 0;
}