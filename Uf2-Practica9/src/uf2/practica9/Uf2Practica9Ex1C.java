package uf2.practica9;

import java.util.*;

public class Uf2Practica9Ex1C {

    public static int m3(int n) {
        int result = 0;

        for (int i = n; i >= 2; i = i/2) {
            result = result + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int result = m3(num);

        System.out.println(num + " " + result);
    }
}
