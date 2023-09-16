package chapterTwo;

import java.util.Scanner;

public class WorldPopulation
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

       Double currentPopulation;
        double yearOne;
        double yearTwo;
        double yearThree;
        double yearFour;
        double yearFive;
        float growthRate;

        System.out.print( "Enter the current world population : ");
        currentPopulation = input.nextDouble();

        System.out.print( "Enter the annual world population growth rate: ");
        growthRate = input.nextFloat();
        growthRate = growthRate / 100;

        yearOne = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "\nWorld population after one year: %.1f\n", yearOne );



        yearTwo = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "World population  after two years: %.1f\n", yearTwo );



        yearThree = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "World population after three years: %.1f\n", yearThree );



        yearFour = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "World population after four years: %.1f\n", yearFour );



        yearFive = currentPopulation + ( currentPopulation * growthRate );
        System.out.printf( "World population after five years: %.1f\n", yearFive );
    }
}
