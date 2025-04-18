package com.satellite.algorithm.recursion;

import java.util.Arrays;

/**
 * 反转字符串
 *
 * 示例:
 * 输入: S = ["h", "e", "l", "l", "o"]
 * 输出: ["o", "l", "l", "e", "h"]
 */
public class ReverseString {

    /**
     * 双指针
     *
     *    h     e     l     l     o
     *   left                   right
     *
     *    o     e     l     l     h
     *         left       right
     *
     *    o     l     l     e     h
     *               left
     *              right
     */
    public static void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }


}
