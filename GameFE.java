/*
 * Written by Anas Bamaroof 
 */

import java.util.Scanner;
import java.util.Random;
public class GameFE {
    private static Prizes GamePrize = new Prizes(); 
    private static PrizesManager PrizeManager = new PrizesManager(); 
    private static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // welcome message 
        System.out.println("Welcome to the showcase show down!"); 
        System.out.println("Your Prizes are: "); 
        PrizeManager.readPrizeFile(); 
        //PrizeManager.PrintPrize();

        // create the game loop 
        boolean play = true; 

        while(play)
        {
            int totalPrize = 0; 
            int currentPrize = 0; 
            for(int i=0; i<5; i++)
            {
                int num = CreateRandom();
                PrizeManager.PrintIndex(num);
                //PrizeManager.addPrices(num);
                currentPrize = PrizeManager.addPrices(num); 
                totalPrize = totalPrize + currentPrize; 
    
            }
            System.out.println("You must guess the total cost of the prizes without going over and within $1,300 of its actual price\nEnter your guess");
            int userGuess = input.nextInt(); 
            gameStat(userGuess, totalPrize);

            System.out.println("Would you like to quit? Enter \"yes\" to quit");
            input.nextLine(); 
            String PlayAgain = input.nextLine(); 
            if(PlayAgain.equalsIgnoreCase("yes"))
                play = false; 
            else if(PlayAgain.equalsIgnoreCase("no"))
            {
                play = true; 
            }
        }








    }


    public static int CreateRandom()
    {
        Random RandomNumber = new Random(); 
        int RandomNumber1 = RandomNumber.nextInt(51); 
        return RandomNumber1; 
    }

    public static void gameStat(int aGuess, int aPrice)
    {
        System.out.println("The actual cost is: " + aPrice);
        if(aGuess > aPrice)
        {
            System.out.println("Your guess was over. You lose!");
        }
        else if((aPrice - aGuess) > 1300)
        {
            System.out.println("Your guess was close, but not close enough. You lose!");
        }
        else if((aGuess-aPrice) < 1300)
        {
            System.out.println("You win!!!");
        }
    }
    
}
