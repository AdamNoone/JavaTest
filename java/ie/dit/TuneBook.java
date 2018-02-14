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
}

