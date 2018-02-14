package ie.dit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	




public void EachTune(int x,String title,String altTitle,String notation)
{
	this.x = x;
	this.title = title;
	this.altTitle = altTitle;
	this.notation = notation;
	
}

public void tunebook()
	{
		String file = "ABC.txt";
		TuneBook b = new TuneBook(file);
		//System.out.println(d);

		
		
	}
/*public String toString()
    {
       //so put all the word in ABC.text into an arry list and the output all word that start with x or t
       //COME BACK TO 
	}*/
	
	public static void main(String[] args)
	{
		Tune main = new Tune();
		main.tunebook();
	}
}