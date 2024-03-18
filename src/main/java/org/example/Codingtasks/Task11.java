package org.example.Codingtasks;

public class Task11 {
    public static void main(String[] args) {

        String[] array = {"David", "Logan", "Forney", "Logan"};
        boolean duplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (j != i && array[i].equals(array[j])) {
                    duplicates =true;
                    System.out.println(duplicates);
                }

            }

        }


    }
}