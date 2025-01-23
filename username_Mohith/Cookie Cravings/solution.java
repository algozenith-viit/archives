package username_Mohith.question;
import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
                int a = in.nextInt();
                int b = in.nextInt();  
                int c = in.nextInt(); 
                int d = in.nextInt(); 
                if(a == 0) System.out.println(1);
                else {
                    int ans = 2*min(b,c);
                    ans += a;
                    ans += min(a+1,abs(b-c)+d);
                    System.out.println(ans);
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
    }
}