/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class HangmanLexicon {
	
	  // This is the HangmanLexicon constructor
	   public HangmanLexicon() {
	      // your initialization code goes here
		   records = new ArrayList<String>();
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
		String word = (String) records.get(index);
		return word;
	}
	
	ArrayList records;
}
