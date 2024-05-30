/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.team_work;

import java.util.Scanner;

/**
 *
 * @author sksoj
 */
public class Team_Work {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum = "+sum);
        
        int sub = num1 - num2;
        System.out.println("Sub = "+sub);
    }
}
