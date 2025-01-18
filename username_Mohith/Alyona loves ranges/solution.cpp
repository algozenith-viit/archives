#include <iostream>
#include <climits>
#include <cmath>
using namespace std;

int main() {
    int testcases;
    cin >> testcases;

    while (testcases-- > 0) {
        int num, l, r;
        cin >> num >> l >> r;

        int ans = INT_MAX;  // Initialize ans to the largest possible value
        if(num < l) {
            cout << -1 << endl;
        } else {
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int secondFactor = num / i;
                    
                    if (l <= i && r >= i) {
                        ans = min(ans, i);
                    }
                    if (l <= secondFactor && r >= secondFactor) {
                        ans = min(ans, secondFactor);
                    }
                }
            }
            if (ans == INT_MAX) {
                cout << -1 << endl;
            } else {
                cout << ans << endl;
            }
        }
    }
    return 0;
}