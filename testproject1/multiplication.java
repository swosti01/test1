
package com.mycompany.testproject1;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner (System.in);
            
            //for print
            System.out.println("Inpute a nember to calcute: ");
            int num = in.nextInt();
            
            for (int i=0; i< 10; i++){
                System.out.println(num + " x " + (i+1) + " = " + (num * (i+1)));
            }
        }
        
    }
}
