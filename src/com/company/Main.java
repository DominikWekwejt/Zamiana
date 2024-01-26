package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int v;
        Scanner wyrazenie = new Scanner(System.in);
        System.out.println("Podaj wartość zmiennej x");
        int x = wyrazenie.nextInt();
        System.out.println("Podaj wartość zmiennej y");
        int y = wyrazenie.nextInt();
        System.out.println("Podaj wartość zmiennej z");
        int z = wyrazenie.nextInt();

        v = (4 * x - y) / (3 * (z * z + 1));
        System.out.print("Wartość obliczonego wyrażenia wynosi:" + v);
    }
}
