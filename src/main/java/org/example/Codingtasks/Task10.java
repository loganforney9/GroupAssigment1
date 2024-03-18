package org.example.Codingtasks;

public class Task10 {
    public static void main(String[] args) {
        {
            double [] temperatures={20.0,21.5,22.0,19.9,19.6,20.5,21.1};
            double max=temperatures[0];
            double min=temperatures[0];
            for(int i=0;i< temperatures.length;i++){
                for(int j=i+1;j< temperatures.length;j++){
                    if(temperatures[i]>temperatures[j]){
                        max=temperatures[i];
                        temperatures[i]=temperatures[j];
                        temperatures[j]=max;

                    }

                }


            }
            System.out.println(temperatures[temperatures.length-2]);

        }
    }
}
