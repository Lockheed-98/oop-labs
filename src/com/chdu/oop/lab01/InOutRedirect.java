/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chdu.oop.lab01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class InOutRedirect {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("out.txt"));
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(in.nextInt() * 2);
        }
        in.close();
    }
}
