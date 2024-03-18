package org.example.Codingtasks;

public class Task9 {
    public static void main(String[] args) {
        {
            double [] numbers={20.0,21.5,22.0,19.9,19.6,20.5,21.1};
            double max=numbers[0];
            double min=numbers[0];
            for(int i=0;i< numbers.length;i++){
                if(max<numbers[i]){
                    max=numbers[i];
                }

            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}
