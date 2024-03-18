package org.example.Codingtasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        for(int i = 2; i < num; i++){
            if((num%i)==0){
                System.out.println("not prime");
                break;
            }
            System.out.println("prime");
            break;
        }



    }
}
