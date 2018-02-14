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
			TunesTuneVals(tunes , filename);
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
	
	    public void TunesTuneVals( ArrayList listoftunes ,String filename)
    {

        // Adapted from: https://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
        BufferedReader inputStream2 = null;

        try {
            inputStream2 = new BufferedReader(new FileReader(filename));
            
            String t;
            while ((t = inputStream2.readLine()) != null) {
                 /*if(t.startsWith("X"))
				{
					this.x = t;
									
				}*/
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
    }
}

