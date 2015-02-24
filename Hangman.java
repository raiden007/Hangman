/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {

    public void run() {
		// Get random word
    	println("Welcome to Hangman!");
    	String randomWord = getRandomWord();
    	println(randomWord);
    	// Display the guessed word
    	String guessedWord = "";
   		for (int i = 0; i < randomWord.length(); i++) {
   			guessedWord += "-";
   		}
    	println("Your guessed word is: " + guessedWord);
    	
    	// Split the word into characters
    	for (int i = 0; i < guessedWord.length(); i++) {
    		char letter = guessedWord.charAt(i);
    		String newWord = (String) newWord + letter;
    		println(newWord);
    	}
    	
    	guesses = 8;
       	while (guesses > 0) {   
        	println("You have " + guesses + " guesses left!");
       		// User input
        	String userInput = readLine("Enter a letter: ");
        	userInput = userInput.toUpperCase();	
        	char guessedLetter = userInput.charAt(0);
	    	boolean isLetter = Character.isLetter(letter);
	    	
	    	// Check if there are more letter or they are not letters
	    	if (userInput.length() > 1) {
	    		println("Only one letter");
	    	} else if (isLetter == false) {
	    		println ("Only letters are accepted");
	    		
	    	// Add characters to the guessed word
	    	//TODO: If you have the same letter twice it will not show the second one
	    	} else {
	    		int indexOfTheGuessedLetter = 0;
	    		indexOfTheGuessedLetter = randomWord.indexOf(userInput);
	    		if ( indexOfTheGuessedLetter != -1) {
	    			guessedWord = guessedWord.substring(0, indexOfTheGuessedLetter) + userInput + guessedWord.substring(indexOfTheGuessedLetter + 1);
	    			println("Your guessed word is: " + guessedWord);
	    		} else {
	    			println("Wrong letter");
	    			guesses --;
	    			if (guesses == 0) {
	    		       	println("GAME OVER!");
	    		       	break;
	    			}
	    		}
	    	}
	    	// Victory for the user
	    	char victoryCondition = '-'; 
	    	if (guessedWord.indexOf(victoryCondition) == -1) {
	    		println("YOU WON!");
	    		break;
	    	}
        }
	}
    }   
    // Gets a random word from the HangmanLexicon class
    private String getRandomWord() {
    	int randomindex = rgen.nextInt(0,lexicon.getWordCount()-1);
    	String randomWord = lexicon.getWord(randomindex);
		return randomWord;
	}
    



	private RandomGenerator rgen = new RandomGenerator();
	private HangmanLexicon lexicon = new HangmanLexicon();
	private int guesses;
}
