import java.util.*;
import java.io.*;

import static java.lang.Math.*;

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
                int num = in.nextInt();
                int l = in.nextInt();
                int r = in.nextInt();
                int ans = Integer.MAX_VALUE;
                if(num < l) {
                    System.out.println("-1");
                } else {
                    for(int i = 1; i*i <= num; i++) {
                        if(num%i == 0) { 
                            int secondFactor = num/i;
                            if(l <= i && r >= i) {
                                ans = min(ans,i);
                            } else if(secondFactor <= r && secondFactor >= l) {
                                ans = min(ans,secondFactor);
                            }
                        }
                    }
                    if(ans == Integer.MAX_VALUE) System.out.println(-1);
                    else System.out.println(ans);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
        //<-------------------------------------- Fast reader ----------------------------------------->
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

        public Integer[] nextIntArray(int start, int end) {
            Integer[] nums = new Integer[end];
            for (int i = start; i < end; i++) {
                nums[i] = Integer.parseInt(next());
            }
            return nums;
        }

        public Long[] nextLongArray(int start, int siz) {
            Long[] nums = new Long[siz];
            for (int i = start; i < siz; i++) {
                nums[i] = Long.parseLong(next());
            }
            return nums;
        }
    }
}