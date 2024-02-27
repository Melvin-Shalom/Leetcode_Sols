/*


#include<iostream>
using namespace std;

int main()
{
    int m, n, num1, num2;
    cout<<"#: ";
    cin>>m>>n;
    
    while (true)
    {
        num1+=m;
    }
    cout<<num1<<endl;
    
}


*/

class Solution {
 public:
  int differenceOfSums(int n, int m) {
    const int sum = (1 + n) * n / 2; // Can give the sum upto n digits
    const int num2 = ds(n, m);
    const int num1 = sum - num2;
    return num1 - num2;
  }

 private:
  int ds(int n, int m) {
    const int last = n / m * m;
    if (last == 0)
        return 0;
    const int first = m;
    const int count = (last - first) / m + 1;
    return (first + last) * count / 2;
  }
};

