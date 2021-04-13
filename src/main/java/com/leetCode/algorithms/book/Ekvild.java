package com.leetCode.algorithms.book;

public class Ekvild {
    public static void main(String[] args) {
        System.out.println(gcd(100, 10));
    }

    public static int gcd(int p, int q){
        if (q == 0) return  p;
        int r = p % q;
        System.out.println(r);
        return gcd(q,r);
    }
}
