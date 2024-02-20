import java.util.Scanner; 
import java.io.*;
public class PrizesManager {

    // create a generic prize instance 
    private GenLL<Prizes> prizes; 

    public PrizesManager()
    {
        prizes = new GenLL<Prizes>(); 
    }
    public void addPrize(Prizes aPrize)
    {
        prizes.add(aPrize);
    }
    public void readPrizeFile()
    {
        try{
            Scanner fileName = new Scanner(new File("prizeList.txt")); 
            while(fileName.hasNextLine())
            {
                String fileLine = fileName.nextLine(); 
                String [] splitLines = fileLine.split("\t"); 
                if(splitLines.length == 2)
                {
                    String name = splitLines[0]; 
                    int price = Integer.parseInt(splitLines[1]); 
                    Prizes aPrize = new Prizes(name, price); 
                    this.addPrize(aPrize); 
                }

            }
            // for(int i=0; i<pricesNames.length; i++)
            // {
            //     System.out.println(pricesNames[i]); 
            // }
            fileName.close(); 

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void PrintPrize()
    {
        prizes.print();
    }
}
