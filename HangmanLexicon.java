/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.awt.*;
import java.io.*;
import java.*;
import acm.util.*;
import acmx.export.java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HangmanLexicon {
	
	  // This is the HangmanLexicon constructor
	   public HangmanLexicon() {
	      // your initialization code goes here
		   ArrayList records = new ArrayList();
		   try {
			   BufferedReader reader = new BufferedReader(new FileReader("HangmanLexicon.txt"));
			   String line;
			    while ((line = reader.readLine()) != null) {
			    	records.add(line);
			    }
			    reader.close();
		   }
		   catch (Exception e)
		   {
		     System.err.format("Exception occurred trying to read '%s'.", "HangmanLexicon.txt");
		     e.printStackTrace();
		   }
	   }

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		int count = records.size();
		return count;

	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		switch (index) {
			case 0: return "BUOY";
			case 1: return "COMPUTER";
			case 2: return "CONNOISSEUR";
			case 3: return "DEHYDRATE";
			case 4: return "FUZZY";
			case 5: return "HUBBUB";
			case 6: return "KEYHOLE";
			case 7: return "QUAGMIRE";
			case 8: return "SLITHER";
			case 9: return "ZIRCON";
			default: throw new ErrorException("getWord: Illegal index");
		}
	}
	
	ArrayList records;
}
