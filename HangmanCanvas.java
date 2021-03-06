/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {

/** Resets the display so that only the scaffold appears */
	public void reset() {
		GLine scaffold = new GLine (100,400, 100, 400-SCAFFOLD_HEIGHT);
		add (scaffold);
		GLine beam = new GLine (100,400-SCAFFOLD_HEIGHT, 100+BEAM_LENGTH,400-SCAFFOLD_HEIGHT );
		add (beam);
		GLine rope = new GLine (100+BEAM_LENGTH,400-SCAFFOLD_HEIGHT,100+BEAM_LENGTH,400-SCAFFOLD_HEIGHT+ROPE_LENGTH );
		add (rope);
	}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		lettersFromUser = lettersFromUser + " " + word;
		GLabel label = new GLabel(lettersFromUser);
		label.setLocation(100, 450);
		add (label);
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter) {
		guesses --;
		if (guesses == 7) {
			drawHead();
		} else if (guesses == 6) {
			drawBody();
		} else if (guesses == 5) {
			drawLeftArm();
		} else if (guesses == 4) {
			drawRightArm();
		} else if (guesses == 3) {
			drawLeftLeg();
		} else if (guesses == 2) {
			drawRightLeg();
		} else if (guesses == 1) {
			drawLeftFoot();
		} else {
			drawRightFoot();
		}
	}

private void drawRightFoot() {
	GLine rightFoot = new GLine (245 + HIP_WIDTH, 95 + BODY_LENGTH + LEG_LENGTH, 245 + HIP_WIDTH + FOOT_LENGTH, 95 + BODY_LENGTH + LEG_LENGTH);
	add (rightFoot);
	
}

private void drawLeftFoot() {
	GLine leftFoot = new GLine (245 - HIP_WIDTH, 95 + BODY_LENGTH + LEG_LENGTH, 245 - HIP_WIDTH - FOOT_LENGTH, 95 + BODY_LENGTH + LEG_LENGTH);
	add (leftFoot);
	
}

private void drawRightLeg() {
	GLine rightHip = new GLine (245,95+BODY_LENGTH, 245 + HIP_WIDTH, 95+BODY_LENGTH );
	add (rightHip);
	GLine rightLeg = new GLine (245 + HIP_WIDTH, 95 + BODY_LENGTH, 245 + HIP_WIDTH, 95 + BODY_LENGTH + LEG_LENGTH);
	add (rightLeg);
}

private void drawLeftLeg() {
	GLine leftHip = new GLine (245,95+BODY_LENGTH, 245 - HIP_WIDTH, 95+BODY_LENGTH );
	add (leftHip);
	GLine leftLeg = new GLine (245 - HIP_WIDTH, 95 + BODY_LENGTH, 245 - HIP_WIDTH, 95 + BODY_LENGTH + LEG_LENGTH);
	add (leftLeg);
}

private void drawRightArm() {
	GLine rightArm = new GLine (245,95 + ARM_OFFSET_FROM_HEAD,245+UPPER_ARM_LENGTH,95 + ARM_OFFSET_FROM_HEAD);
	add (rightArm);
	GLine rightHand = new GLine (245+UPPER_ARM_LENGTH,95 + ARM_OFFSET_FROM_HEAD, 245 + UPPER_ARM_LENGTH, 95 + ARM_OFFSET_FROM_HEAD+LOWER_ARM_LENGTH);
	add (rightHand);
	
}

private void drawLeftArm() {
	GLine leftArm = new GLine (245,95 + ARM_OFFSET_FROM_HEAD,245-UPPER_ARM_LENGTH,95 + ARM_OFFSET_FROM_HEAD);
	add (leftArm);
	GLine leftHand = new GLine (245-UPPER_ARM_LENGTH,95 + ARM_OFFSET_FROM_HEAD, 245-UPPER_ARM_LENGTH, 95 + ARM_OFFSET_FROM_HEAD+LOWER_ARM_LENGTH);
	add (leftHand);
	
}

private void drawBody() {
	GLine body = new GLine (245,95,245,95+BODY_LENGTH);
	add (body);
	
}

private void drawHead() {
	GOval head = new GOval (225,60,HEAD_RADIUS, HEAD_RADIUS);
	add (head);
}

/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;
	private int guesses = 8;
	private String lettersFromUser = " ";

}
