package org.example.Codingtasks;

public class Task7 {
    public static void main(String[] args) {
        int num=0;
        int num2=1;
        int sum=0;
        for(int i = 0; i < 11; i++) {

            sum=num+num2;
            System.out.println(sum);
            num=num2;
            num2=sum;



        }

    }
}
