/*
 * Written by Anas Bamaroof 
 */

import java.util.Scanner;
import java.util.Random;
public class GameFE {
    public static void main(String[] args) {
        Random Random1 = new Random(); 
        String [] names = new String[] {"Anas", "Ali", "Bassem", "Mhammed", "Jassefrerfm"}; 
        int [] prize = new int[] {10,20,30,40,50}; 

        int picks[] = new int[5];
        int tryout[] = {}; 

        int nextIndex =0;  
        int num = CreateRandom();
        int counter =0; 
        picks[0] = num; 
        boolean generateValues = true;
        while(counter < 6)
        { 
            int num2 = CreateRandom(); 
            //generateValues = false; 
            //check if this number exists on the array 
            
            for(int i=0; i<picks.length; i++)
            {
                if(picks[i] != num2)
                {
                    picks[i] = num2; 
                    counter++; 
                    break; 
                }
                else 
                {
                    CreateRandom();
                    break;  
                } 
            }
        }
        //System.out.println(CreateRandom()); 
        for (int number : picks) {
            System.out.println(number);
        }
        

    }
    public static int CreateRandom()
    {
        Random RandomNumber = new Random(); 
        int RandomNumber1 = RandomNumber.nextInt(5); 
        return RandomNumber1; 
    }
    public static boolean unique(int aNumber)
    {
        int [] uniqeArr = new int[5]; 
        for(int i=0; i<5; i++)
        {
            if(uniqeArr[i] == aNumber)
                return true;
        }
        return false; 
    }
    // public static void printArray() 
    // {
    //     int temp [] = new int [5]; 
    //     for(int i=0; i<5; i++)
    //     {
    //         System.out.println(temp[i]);
    //     }
    // }
}
