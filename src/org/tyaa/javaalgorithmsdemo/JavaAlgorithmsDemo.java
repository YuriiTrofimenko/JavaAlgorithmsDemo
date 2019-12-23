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
        
        System.out.println("Введите целое положительное число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n10 = n % 10;
        
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
    
}
