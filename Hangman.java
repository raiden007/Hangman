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
    	guesses = 8;
   		
       	while (guesses > 0) {   
        	println("You have " + guesses + " guesses left!");
       		// User input
        	String userInput = readLine("Enter a letter: ");
        	userInput = userInput.toUpperCase();	
        	char letter = userInput.charAt(0);
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
	    			println(guessedWord);
	    		} else {
	    			println("Wrong letter");
	    			guesses --;
	    		}
	    	}
	    	// Victory for the user
	    	char victoryCondition = '-'; 
	    	if (guessedWord.indexOf(victoryCondition) == -1) {
	    		println("YOU WON!");
	    		break;
	    	}
        }
       	
       	println("GAME OVER!");
    	//TODO: Implement the basic control structure and manage the details 
    	// (ask the user to guess a letter, keep track of the number of guesses remaining, print out the various messages, detect the end of the game, and so forth).
		
	/*	
		
		
		The sample runs in Figure 1 should be sufficient to illustrate the basic operation of the game, but the following points may help to clarify a few issues:
		• At the beginning of your run method, you need to create a new HangmanLexicon and store it in an instance variable. 
		If you extend the program to allow the user to play multiple games, 
		the creation of the HangmanLexicon should be performed outside the loop that plays the game repeatedly so that this operation is performed once rather than for every game.
		• You should accept the user’s guesses in either lower or upper case, even though all letters in the secret words are written in upper case.
		• If the user guesses something other than a single letter, your program should tell the user that the guess is illegal and accept a new guess.
		• If the user guesses a correct letter more than once, your program should simply do nothing. 
		Guessing an incorrect letter a second time should be counted as another wrong guess. 
		(In each case, these interpretations are the easiest way to handle the situation, and your program will probably do the right thing even if you don’t think about these cases in detail.)
		Remember to finish Part I before moving on to Part II. Part II is arguably more fun, but it is essential to develop large programs in manageable stages.
		*/
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
