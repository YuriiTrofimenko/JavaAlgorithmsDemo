/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaalgorithmsdemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaAlgorithmsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int x = 2;
        //System.out.println("Введите любую цифру от 0 до 9:");
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();*/
 /*if(x == 2){
            System.out.println("х == 2");
        }*/
 /*if(x != 2){
            System.out.println("х != 2");
        }*/
 /*if(x > 2){
            System.out.println("х > 2");
        }*/
 /*if(x <= 2){
            System.out.println("х <= 2");
        }*/

 /*if (x == 0) {
            System.out.println("x == 0");
        } else {
            System.out.println("x не равен 0");
        }*/
 /*if (x == 0) {
            System.out.println("x == 0");
        } else if(x > 5) {
            System.out.println("x > 5");
        } else {
            System.out.println("x не равен 0 и х не болшьше 5");
        }*/
 /*switch(x){
            case 0:{
                System.out.println("x == 0");
                break;
            }
            case 1:{
                System.out.println("x == 1");
                break;
            }
            default:{
                System.out.println("x равен не предусмотренному значению");
            }
        }*/
 /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int x = sc.nextInt();
        System.out.println("Введите второе целое число:");
        int y = sc.nextInt();
        
        System.out.println("x = " + x + "; y = " + y);*/
 /*if (x > 5 && y > 5) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }*/
 /*if (x > 5 || y > 5) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }*/
 
        /* if n switch demo */
 
        /* System.out.println("Введите целое положительное число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n100 = n % 100;
        if (n100 >= 11 && n100 <= 14) {
            System.out.println("Ворон");
        } else {
            int n10 = n % 10;
            switch (n10) {
                case 1: {
                    System.out.println("Ворона");
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    System.out.println("Вороны");
                    break;
                }
                default: {
                    System.out.println("Ворон");
                }
            }
        }*/
        
        /* loops demo */
        
        /* for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        } */
        
        Scanner sc = new Scanner(System.in);
        
        MAIN : while (true) {
            System.out.println("Введите целое положительное число:");
            int n = sc.nextInt();
            int n10 = n % 10;
            int n100 = n % 100;
            if (n100 >= 11 && n100 <= 14) {
                System.out.println("Ворон");
            } else {
                switch(n10){
                    case 1:{
                        System.out.println("Ворона");
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        System.out.println("Вороны");
                        break;
                    }
                    default:{
                        System.out.println("Ворон");
                    }
                }
            }
            while (true) {               
                System.out.println("Continue? (y/n)");
                switch(sc.next()){
                    case "y": {
                        continue MAIN;
                    }
                    case "n": {
                        break MAIN;
                    }
                }
            }
        }
    }

}
