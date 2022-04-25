package lcs;

import java.util.*;
import org.slf4j.*;


public class Cal {

    Validate v = new Validate();
    Logger logger = LoggerFactory.getLogger("Calculation");

    public void lcs(String x, String y) {
        int m = x.length();
        int n = y.length();
        int matrix[][] = new int[m + 1][n + 1];
        int len = 0, row = 0, col = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) // mang rong => k co lcs
                {
                    matrix[i][j] = 0;
                } else if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    if (len < matrix[i][j]) {
                        len = matrix[i][j];
                        row = i;
                        col = j;
                    }
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        if (len == 0) {
//            System.out.println("No LCSub");
            logger.info("No LCSub");
        }
        String res = "";
        while (matrix[row][col] != 0) {
            res = x.charAt(row - 1) + res; // y.charAt(col-1)
            len--;
            row--;
            col--;
        }
        
        logger.info("LCS: " + res);

//        System.out.println("LCS: ");
//        System.out.println(res);
    }
}
