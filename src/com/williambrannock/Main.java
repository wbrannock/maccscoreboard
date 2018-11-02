package com.williambrannock;
import java.util.Scanner;

/**
 * Welcome to my MACC Scoreboard
 * created by William Brannock
 * Free use by any MACC team is acceptable
 */

public class Main {
    //Fields
    static int questionCount;
    static int teamAScore;
    static int teamBScore;
    static Scanner sc = new Scanner(System.in);
    //Constructor
    public Main()
    {
        questionCount = 0;
        teamAScore = 0;
        teamBScore = 0;
    }

    /**
     * Main method
     * @param args not important
     */
    public static void main(String[] args)
    {
	    directQuestion(10);
    }

    /**
     * Adds the logic for directive questions
     * @param questions number of questions in each directive round
     */
    public static void directQuestion(int questions)
    {
        int i = 0;
        while (i < questions)
        {
            System.out.println("This is question: " + (i + 1));
            System.out.println("Who got the Directive Question? (a, b, n)");
            String questionCorrect = sc.next();
            if (questionCorrect.equals("a"))
            {
                teamAScore = teamAScore + 5;
                i++;
            }
            else if (questionCorrect.equals("b"))
            {
                teamBScore = teamBScore + 5;
                i++;
            }
            else if (questionCorrect.equals("n"))
            {
                teamBScore = teamBScore + 0;
                teamAScore = teamAScore + 0;
                i++;
            }
            else
            {
                System.out.println("Error. Please enter a, b, or n");
            }
            displayCurrentScore();


        }
    }

    /**
     * Provides a print out of the current Score
     */
    public static void displayCurrentScore()
    {
        System.out.println("################");
        System.out.println("The current score is: ");
        System.out.println("A Score: ");
        System.out.println(teamAScore);
        System.out.println("B Score");
        System.out.println(teamBScore);
        System.out.println("################");
    }
}
