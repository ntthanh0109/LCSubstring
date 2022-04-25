package lcs;

import java.io.*;

public class Lcs {

    /*
    static void lcs(String X, String Y, int m, int n)
    {
        int[][] L = new int[m + 1][n + 1];
 
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) // mang rong => k co lcs
                    L[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1; //lcs bo sung x[i-1] (b=1)
                else //lcs k co them phan tu nao
                    L[i][j] = Math.max(L[i - 1][j],L[i][j - 1]);
                //a>b => len tren (b=2)
                //a<b ==> sang trai (b=3)
//                else if ( L[i-1][j] >= L[i][j-1])
//                    L[i][j]=L[i-1][j];
//                else
//                    L[i][j]=L[i][j-1];
            }
        }
 
        //  create LCS
        int index = L[m][n];
        int temp = index;
 
        // array to store the lcs string
        char[] lcs = new char[index+1];
        lcs[index] = '\0'; 
 
        //duoi cung ben phai len trai
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            // x[]=y[] thi add vao lcs
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs[index-1] = X.charAt(i - 1);

                i--;
                j--;
                index--;
            }

            else if (L[i - 1][j] > L[i][j - 1]) //(b=2)
                i--; //di len tren
            else
                j--; // di sang trai (b=3)
        }
 
        // Print lcs
        System.out.print("LCS of " + X + " and " + Y
                         + " is ");
        for (int k = 0; k <= temp; k++)
            System.out.print(lcs[k]+" ");
    }
 //-------------------------------------------------
     */
    public static void main(String[] args) {
        Validate v = new Validate();
        Cal c = new Cal();
        String x = v.getString("Enter string x: ", "cannot be null");
        String y = v.getString("Enter string y: ", "cannot be null");
        c.lcs(x, y);
    }

}
