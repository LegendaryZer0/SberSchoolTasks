package ru.task1;

import java.util.Scanner;

public class PositionSearcher {
    private int s = 9;
    private long rankMult;
    private long x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        System.out.println(new PositionSearcher().getN(k + 1));
    }

    public long getN(long position) {
        int a = 1;
        long q = s;
        long p = 1;
        rankMult = 10;
        while (position % q < position && (double) position / q > 1) {
            position -= q;
            a = a + 1;
            q = (long) s * (a) * (p *= rankMult);
        }
        return getV(a, position, q);
    }

    private long getV(int a, long pos, long q) {
        if (a == 1) {
            return pos;
        }
        q /= 9;
        if (pos % a == 1) {
            return pos / q + 1;
        }
        pos %= q;
        q /= rankMult;
        for (int i = 2; i < a; i++) {
            if (pos % a == i) {
                return (pos / q);
            }
            pos %= q;
            q /= rankMult;
        }
        x = a;
        if (pos % a == 0) {
            return (pos / a) - 1;
        }
        return 0;
    }
}
