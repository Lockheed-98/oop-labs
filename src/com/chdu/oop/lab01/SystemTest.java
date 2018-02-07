/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chdu.oop.lab01;

/**
 *
 * @author Andrew
 */
public class SystemTest {
    public static void main(String[] args) {
        System.out.print("Час у мілісекундах з 01.01.1970 ");
        System.out.println(System.currentTimeMillis());
        
        System.out.print("Тривалість роботи програми ");
        System.out.println(System.nanoTime());
        
        System.out.print("Домашня директорія користувача ");
        System.out.println(System.getProperty("user.home"));
        
        System.out.println("Виклик збірника мусора ");
                System.gc();
                
                System.out.print("Змінна оточення Temp ");
                System.out.println(System.getenv("temp"));
                
                System.out.println("Вихід з кодом завершення -10 ");
                System.exit(-10);
    }
}
