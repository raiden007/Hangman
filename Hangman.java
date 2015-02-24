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
		/* You fill this in */
    	//TODO: Choose a random word as the secret word.
    	
    	//TODO: Keep track of the partially guessed word from the user. It begins as a series of dashes and it's updated with the correct letters.
    	// This can be done as separate characters that can get updated and then shown as a string?
    	
    	//TODO: Implement the basic control structure and manage the details 
    	// (ask the user to guess a letter, keep track of the number of guesses remaining, print out the various messages, detect the end of the game, and so forth).
		println("asasa");
		
	/*	Part I—Playing a console-based game
		In the first part of this assignment, your job is to write a program that handles the user interaction component of the game—everything except the graphical display. 
		To solve the problem, your program must be able to:
		• Choose a random word to use as the secret word. That word is chosen from a word list, as described in the following paragraph.
		• Keep track of the user’s partially guessed word, which begins as a series of dashes and then updated as correct letters are guessed.
		• Implement the basic control structure and manage the details 
		(ask the user to guess a letter, keep track of the number of guesses remaining, print out the various messages, detect the end of the game, and so forth).
		
		The only operation that is beyond your current knowledge is that of representing the list of words from which you can choose a word at random. 
		For the first two parts of the assignment, you will simply make use of a class that we’ve given you called HangmanLexicon that provides a small list of words that will allow you to test your program. 
		(A lexicon is very much like a dictionary, but does not necessarily include definitions, which makes it a more appropriate name for a class that provides a list of words with no associated meanings.) 
		The implementation of the class you’ve been given is only a temporary expedient to make it possible to code the rest of the assignment. 
		In Part III, you will replace the definition we’ve provided with one that reads a list of words from a data file.
		The strategy of creating a temporary implementation that provides enough functionality to implement the rest of the program is a common technique in programming. 
		Such temporary implementations are usually called stubs. 
		In this assignment, the starter project comes with a stub implementation of the HangmanLexicon class, which appears in Figure 2 on the next page.
		 The class contains two public methods: getWordCount(), which returns the number of words in the lexicon, and getWord(i), which returns the word at index i. 
		 Like all indices in Java, the value i runs from 0 to one less than the number of words.
		A game that used this implementation of the HangmanLexicon class would quickly become uninteresting because there are only ten words available. 
		Even so, it will allow you to develop the rest of the program and then come back and improve this part later.
		Part I is a string manipulation problem using the methods developed in Chapter 8. 
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

}
