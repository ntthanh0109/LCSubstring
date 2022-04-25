package lcs;

import java.io.*;

public class Lcs {

    public static void main(String[] args) {
        Validate v = new Validate();
        Cal c = new Cal();
        String x = v.getString("Enter string x: ", "cannot be null");
        String y = v.getString("Enter string y: ", "cannot be null");
        c.lcs(x, y);
    }

}
