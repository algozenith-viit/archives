import java.io.*;
import java.util.*;
public class solution {

    private static final int mod = (int) 1e9 + 7; // mod
    private static final int iif = 998244353; // int infinity!

    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
        
            int testcases = 1;

            testcases = in.nextInt();
            //<------------------------ Main Code starts Here --------------------------------------------->

            while (testcases-- > 0) {

                int row = in.nextInt();
                int col = in.nextInt();

                int[][] mat = new int[row][col];
                for(int i = 0; i < row; i++) {
                    for(int j = 0; j < col; j++) {
                        mat[i][j] = in.nextInt();
                    }
                }
                long[][][] dp = new long[row][col][1025];
                dp[0][0][mat[0][0]] = 1;
                for(int i = 0; i < row; i++) {
                    for(int j = 0; j < col; j++) {
                        for (int xor = 0; xor <= 1024; xor++) {
                            if (dp[i][j][xor] > 0) {
                                if (i + 1 < row) {
                                    int newXOR = xor ^ mat[i + 1][j];
                                    dp[i + 1][j][newXOR] += dp[i][j][xor];
                                }
                                if (j + 1 < col) {
                                    int newXOR = xor ^ mat[i][j + 1];
                                    dp[i][j + 1][newXOR] += dp[i][j][xor];
                                }
                            }
                        }
                    }
                }
                System.out.println(dp[row-1][col-1][0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}