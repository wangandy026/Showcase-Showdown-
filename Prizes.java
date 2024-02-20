// this file will read the prices and store them in an array 
/*
 * Written by Anas Bamaroof 
 * February 20th 
 * This class is to create an istance of a price class (name and price) 
 * each row on the document is a prize 
 */
import java.io.File;
import java.io.FileReader;
import java.util.*;
public class Prizes {
    public String name; 
    public int price; 

    public Prizes()
    {
        this.name = "none";
        this.price = 0; 
    }
    public Prizes(String aName, int aPrice)
    {
        this.setName(aName);
        this.setPrice(aPrice);
    }
    public void setName(String aName)
    {
        if(aName != null)
        {
            this.name = aName; 
        }
    }
    public void setPrice(int aprice)
    {
        if(aprice > 0)
        {
            this.price = aprice; 
        }
    }
    public String getName()
    {
        return this.name; 
    }
    public double getPrice()
    {
        return this.price; 
    }


    //generic methods (toString and equals) 
    public String toString()
    {
        return "Name: "+this.name+" Price: $"+this.price+" "; 
    }

    public boolean equals(Prizes aPrize)
    {
        return aPrize != null &&
                    this.name.equals(aPrize.getName()) && 
                    this.price == aPrize.getPrice(); 
    }
    
  
        
    }
    // public static String [] addObjects(String aName)
    // {
    //     String [] pricesNames = new String [10]; 
    //     for(int i =0; i<aName.length(); i++)
    //     {
    //         pricesNames[i] = aName; 
    //     }
    //     return pricesNames; 
    // }
