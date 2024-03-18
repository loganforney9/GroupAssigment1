package org.example.Codingtasks;

public class Task1 {
    public static void main(String[] args) {
        double [] temperatures={20.0,21.5,22.0,19.9,19.6,20.5,21.1};
        double max=temperatures[0];
        double min=temperatures[0];
        for(int i=0;i< temperatures.length;i++){
            if(max<temperatures[i]){
                max=temperatures[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
