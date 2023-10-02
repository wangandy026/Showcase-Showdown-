// this file will read the prizes and store them in an array 
import java.io.FileReader;
import java.util.*;
public class Prizes {


    public String[] readPrizeFile()
    {
        try{
            Scanner fileName = new Scanner("prizeList.txt"); 
            while(fileName.hasNextLine())
            {
                String fileLine = fileName.nextLine(); 
                String [] splitLines = fileLine.split("\t"); 
                if(splitLines.length == 2)
                {
                    String name = splitLines[0]; 
                    double prize = Double.parseDouble(splitLines[1]);  
                }
            }
            fileName.close(); 

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
        
    }
    
}
