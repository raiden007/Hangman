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
	
	 public void init() {
         canvas = new HangmanCanvas();
         add(canvas);
	 }

    public void run() {
    	canvas.reset();
		// Get random word
    	println("Welcome to Hangman!");
    	randomWord = getRandomWord();
 //   	println(randomWord);
    	// Display the guessed word
    	guessedWord = populateGuessedWord(randomWord);
    	println("Your guessed word is: " + guessedWord);
    	playGame();
    }
    
    private void playGame() {
    	guesses = 8;
       	while (guesses > 0) {   
        	println("You have " + guesses + " guesses left!");

       		// User input
        	userInput = getUserInput();
	    	textRemainsToBeProcessed = randomWord;
    		indexOfTheGuessedLetter = textRemainsToBeProcessed.indexOf(userInput);
    		if (indexOfTheGuessedLetter != -1) {
    			for (int i = 0; i < randomWord.length(); i++) {
    				if (userInput.charAt(0) == randomWord.charAt(i)) {
    					guessedWord = guessedWord.substring(0, i) + userInput + guessedWord.substring(i + 1);
    					canvas.displayWord(guessedWord);
    				}
    			}
			println("Your guessed word is: " + guessedWord);

        	}

	    	if (indexOfTheGuessedLetter == -1) {
	    		canvas.noteIncorrectGuess(userInput.charAt(0));
	    		println("Wrong letter");
	    		guesses --;
	    		if (guesses == 0) {
	    			println("GAME OVER!");
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

	private String getUserInput() {
    	String userInput = readLine("Enter a letter: ");
    	userInput = userInput.toUpperCase();
    	boolean isLetter = Character.isLetter(userInput.charAt(0));
    	// Check it's only one letter
    	if (userInput.length() > 1) {
    		println("Only one letter");
    	// Check it's a letter
    	} else if (isLetter == false) {
    		println ("Only letters are accepted");
    	}
    	return userInput;
	}

	private String populateGuessedWord(String randomWord) {
		guessedWord = "";
   		for (int i = 0; i < randomWord.length(); i++) {
   			guessedWord += "-";
   		}
    	return guessedWord;
		
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
	String randomWord;
	String guessedWord;
	String userInput;
	String textRemainsToBeProcessed;
	int indexOfTheGuessedLetter;
	private HangmanCanvas canvas;
}
