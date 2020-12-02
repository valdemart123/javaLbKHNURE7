package com.valentyn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s = "a b c *d* e";
        char a = '*';
        String [] str = s.split(" ");
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile("^[(*].*[)*]$");
        for (String string : str) {
            Matcher m = p.matcher(string);
            if (!m.matches()) {
                sb.append(string);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}