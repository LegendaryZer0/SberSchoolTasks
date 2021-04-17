package ru.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Nigmatyanov Rifdar
 * Second Task For Sber School
 */
public class FibbBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Byte> numbers = new ArrayList<>();
        long[] f = new long[99999999]; //Если выстаить Integer.MAX_VALUE, jvm -ке не хватает оперативки,пусть будет так
        int len = 0;
        f[0] = 0;
        f[1] = 1;
        int i = 2;
        while (f[i] <= n) {
            f[i] = f[i - 1] + f[i - 2];

            if (f[i] > n) {
                len = i - 1;
                break;
            }
            ++i;
        }
        int k = 0;

        while (n != 0) {
            if (f[len - k] <= n) {

                n -= f[len - k];
                numbers.add((byte) 1);
                k += 2;
                if (n != 0) {
                    numbers.add((byte) 0);
                } else {
                    for (int j = 0; j < len - k; j++) {
                        numbers.add((byte) 0);
                    }
                    break;
                }
                if (len - k < 0) break;
            } else {

                numbers.add((byte) 0);
                k += 1;
            }

        }
        numbers.forEach(System.out::print);

    }
}
