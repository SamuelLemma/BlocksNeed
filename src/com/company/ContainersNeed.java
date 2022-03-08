package com.company;

public class ContainersNeed {

    public static void main(String[] args) {
     //Odd Number between 50 and 100

        int amountOfbricks = 65;

     // Even number of that fit in container

        int containerCapacity = 6;

     // Calculation of Container not full

       int Unfilled = amountOfbricks % containerCapacity;
       System.out.println("The Number of Unfilled container is:" + Unfilled);

     //  Calculation of filled full

       int full= amountOfbricks / containerCapacity;
       System.out.printf("The Number containers full is" + full);

     //   Container in general

       int total = full + Unfilled;
       System.out.println("total number of containers is:" + total);

    }
}
