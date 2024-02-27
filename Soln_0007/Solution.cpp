class Solution {
public:
    int reverse(int x) {
        long ank = 0;

        while (x != 0) {
            ank = ank * 10 + x % 10; 
            x /= 10;
        }

        if (ank < INT_MIN || ank > INT_MAX) {return 0;} 
        else {return ank;}
    }
};

