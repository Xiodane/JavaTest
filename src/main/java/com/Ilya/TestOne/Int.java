package com.Ilya.TestOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ComenT on 04.01.2016.
 */
public class Int {
    int a;
    System.out.println("Введите a");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    a = Integer.parseInt(reader.readLine());
    System.out.println(a);
}
