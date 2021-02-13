package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] mas = {1.6, 3.8, 7.7, 5.7, 8.6, 4.7, -6.7, 5.3, -3.2, -6, 4, 9.1, -6.2, 4.3, -3.8, -9.3};
        System.out.println(Arrays.toString(mas));
        int pos = 0;
        double result = 0;
        boolean res = false;
        for (double n:mas) {
            if (n < 0){
                res = true;
            }

            if (res == true){
                if (n > 0){
                    result += n;
                    pos++;
                }
            }
        }
        System.out.println("Сумма: " + result + " Количество: " + pos + " Ср ариф: " + result/pos);
    }
}
