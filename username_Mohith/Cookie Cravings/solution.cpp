#include <iostream>
#include <algorithm> // For min() and abs()
using namespace std;

int main() {
    int testcases = 1;
    cin >> testcases;

    //<------------------------ Main Code starts Here --------------------------------------------->
    while (testcases-- > 0) {
        int a, b, c, d;
        cin >> a >> b >> c >> d;

        if (a == 0) {
            cout << 1 << endl;
        } else {
            int ans = 2 * min(b, c);
            ans += a;
            ans += min(a + 1, abs(b - c) + d);
            cout << ans << endl;
        }
    }

    return 0;
}