#include <iostream>
#include <vector>
#include <cstring> // For memset
using namespace std;

const int MOD = 1e9 + 7; // Modulus
const int INF = 998244353; // Infinity

int main() {
    int testcases;
    cin >> testcases;

    while (testcases-- > 0) {
        int row, col;
        cin >> row >> col;

        vector<vector<int>> mat(row, vector<int>(col));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cin >> mat[i][j];
            }
        }

        // Define 3D DP array
        vector<vector<vector<long long>>> dp(row, vector<vector<long long>>(col, vector<long long>(1025, 0)));
        dp[0][0][mat[0][0]] = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int xor_val = 0; xor_val <= 1024; xor_val++) {
                    if (dp[i][j][xor_val] > 0) {
                        // Move down
                        if (i + 1 < row) {
                            int newXOR = xor_val ^ mat[i + 1][j];
                            dp[i + 1][j][newXOR] += dp[i][j][xor_val];
                        }
                        // Move right
                        if (j + 1 < col) {
                            int newXOR = xor_val ^ mat[i][j + 1];
                            dp[i][j + 1][newXOR] += dp[i][j][xor_val];
                        }
                    }
                }
            }
        }
        // Print the result
        cout << dp[row - 1][col - 1][0] << endl;
    }
    return 0;
}