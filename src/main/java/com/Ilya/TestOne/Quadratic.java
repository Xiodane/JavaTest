package com.Ilya.TestOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ComenT on 03.01.2016.
 */
public class Quadratic {
    public static void main(String[] args) throws IOException {
        int a,b,c;
        float x1,x2,D;
        System.out.println("Введите a");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        System.out.println("Введите b");
        b = Integer.parseInt(reader.readLine());
        System.out.println("Введите c");
        c = Integer.parseInt(reader.readLine());
        D = b*b - 4*a*c;


    }
}
