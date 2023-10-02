import java.util.Scanner;
import java.util.Random;
public class GameFE {
    public static void main(String[] args) {
        Random Random1 = new Random(); 
        String [] names = new String[] {"Anas", "Ali", "Bassem", "Mhammed", "Jassem"}; 
        int [] prize = new int[] {10,20,30,40,50}; 


        int picks[] = new int[5];
        System.out.println(Random1); 

        for(int i=0; i<5; i++)
        { 
            boolean unique = true;
            int Random2 = Random1.nextInt(5);
            while(unique)
            {
                for(int j=0; j<5; j++)
                {
                    if(picks[j] == Random2)
                        unique = false; 
                        
                }
                unique = false; 
            }
            picks[i] = Random2;
            System.out.println("***********************************");
            System.out.println(picks[i]);

        }

    


    }
    
}
