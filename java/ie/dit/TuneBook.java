package ie.dit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

 public TuneBook(String filename)
    {
        loadTunes(filename);
		//findTune("Irish Washerwoman, The", tunes);
		
    }

public  String toString()
    {
        StringBuffer sb = new StringBuffer();
        for(String word:tunes)
        {
            sb.append(word + ",");
			//System.out.Println(sb);
        }

        return sb.toString();

	}

    public void loadTunes( String filename)
    {

        // Adapted from: https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(filename));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                tunes.add(l);
				
            }
			System.out.println(tunes);
			//TunesTuneVals(tunes , filename);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
	
	
	//Function to search for the name of songs 
/*	public void findTune(String title,ArrayList tunes)
	{
		String NameSong = ""; //each word is stored in singleWord and checked
        int occurances = 0;

        //go through each word in the ArrayList
        for(String eachWord : tunes)
        {
            NameSong = eachWord;

            if(NameSong.contans(title))
            {
                System.out.println(title + " if song was found in File" );
                
                occurances++;
            }
        }
        System.out.println(occurances + " matches found for song" + title + ".");
        
		
	}*/
	
		//fuction to et each objets attributes
	  /*  public void TunesTuneVals( ArrayList listoftunes ,String filename)
    {

      
        BufferedReader inputStream2 = null;

        try {
            inputStream2 = new BufferedReader(new FileReader(filename));
            
            String t;
            while ((t = inputStream2.readLine()) != null) {
                 /*if(t.startsWith("X"))
				{
					this.x = t;
									
				}
				 if(t.startsWith("T"))
				{
					this.title = t;
									
				}
					
				
            }
			System.out.println(tunes);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream2 != null) {
                try
                {
                    inputStream2.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }*/
}

