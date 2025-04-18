package com.satellite.algorithm.recursion;

/**
 * 递归反向打印字符串
 */
public class ReversePrintString {
    public static String f(int n, String str) {
        if (str == null || str.length() == 0 || n >= str.length()) {
            return "";
        }
        return f(n + 1, str) + str.charAt(n);
    }

    public static void main(String[] args) {
        String hello = f(0, "hello");
        System.out.println(hello);
    }
}
