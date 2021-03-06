/** MIT License Copyright (c) 2021 Giuliana Bouzon

* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:

* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.

* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*/

package demoH;

import java.util.Random;
import java.util.Scanner;

/**
* Simple Hangman game. 
* @author Giuliana Bouzon
*/
public class Hangman {
    
    //Scanner
    static Scanner scanner = new Scanner(System.in);
    
    //gigantic word list
    static String[] wordList = {"abruptly", "absurd", "abyss", "affix", "askew", "avenue", "awkward", "axiom", "azure", 
    "bagpipes", "bandwagon", "banjo", "bayou", "beekeeper", "bikini", "blitz", "blizzard", "boggle", "bookworm", 
    "boxcar", "boxful", "buckaroo", "buffalo", "buffoon", "buxom", "buzzard", "buzzing", "buzzwords", "caliph", 
    "cobweb", "cockiness", "croquet", "crypt", "curacao", "cycle", "daiquiri", "dirndl", "disavow", "dizzying", 
    "duplex", "dwarves", "embezzle", "equip", "espionage", "euouae", "exodus", "faking", "fishhook", "fixable", 
    "fjord", "flapjack", "flopping", "fluffiness", "flyby", "foxglove", "frazzled", "frizzled", "fuchsia", "funny", 
    "gabby", "galaxy", "galvanize", "gazebo", "giaour", "gizmo", "glowworm", "glyph", "gnarly", "gnostic", "gossip", 
    "grogginess", "haiku", "haphazard", "hyphen", "iatrogenic", "icebox", "injury", "ivory", "ivy", "jackpop", "jaundice", 
    "jawbreaker",  "jaywalk", "jazziest", "jazzy", "jelly", "jigsaw", "jinx", "jiujitsu", "jockey", "jogging", "joking", 
    "jovial", "joyful", "juicy", "jukebox", "jumbo", "kayak", "kazoo", "keyhole", "khaki", "kilobyte", "kiosk", "kitsch", 
    "kiwifruit", "klutz", "knapsack", "larynx", "lengths", "lucky", "luxury", "lymph", "marquis", "matrix", "megahertz", 
    "microwave", "mnemonic", "mystify", "naphtha", "nightclub", "nowadays", "numbskull", "nymph", "onyx", "ovary", 
    "oxidize", "oxygen", "pajama", "peekaboo", "phlegm", "pixel", "pizazz", "pneumonia", "polka", "pshaw", "psyche", 
    "puppy", "puzzling", "quartz", "queue", "quips", "quixotic", "quiz", "quizzes", "quorum", "razzmatazz", "rhubarb", 
    "rhythm", "rickshaw", "schnapps", "scratch", "shiv", "snazzy", "sphinx", "spritz", "squawk", "staff", "strength", 
    "strengths", "stretch", "stronghold", "stymied", "subway", "swivel", "syndrome", "thriftless", "thumbscrew", "topaz", 
    "transcript", "transgress", "transplant", "triphthong", "twelfth", "twelfths", "unknown", "unworthy", "unzip", 
    "uptown", "vaporize", "vixen", "vodka", "voodoo", "vortex", "voyeurism", "walkway", "waltz", "wave", "wavy", 
    "waxy", "wellspring", "wheezy", "whiskey", "whizzing", "whomever", "wimpy", "witchcraft", "wizard", "woozy", 
    "wristwatch", "wyvern", "xylophone", "yachtsman", "yippee", "yoked", "youthful", "yummy", "zephyr", "zigzag", 
    "zigzagging", "zilch", "zipper", "zodiac", "zombie", };
    
    /**
     * Checks if a given character array contains the specified character.
     * @param chars, the input character array.
     * @param c, the specified character.
     * @return true if the array contains the character and false if otherwise.
     */
    public static boolean contains(char[] chars, char c) {
	for (char letter : chars)
	    if (letter == c)
		return true;
	
	return false;
    }
    
    public static void main(String[] args) {
	
	//choosing a random word from the word list
	String chosenWord = wordList[new Random().nextInt(wordList.length)];
	
	//displaying the chosen word 
	//this is me cheating in my own game 
	System.out.println("The word is: " + chosenWord);
	
	//making a char array of the same length as the chosen word ^^
	int wordLength = chosenWord.length();
	char[] wordDisplay = new char[wordLength];

	boolean isGameOver = false;
	int lives = 6; 

	//creating blanks where letters are supposed to be
	for (int i = 0; i < wordLength; i++) 
	    wordDisplay[i] = '_';

    
	//keeps prompting the user to enter a letter while the user has neither lost nor won
	while (!isGameOver) {
    	    System.out.print("\nGuess a letter: ");
    	    char guess = scanner.next().charAt(0);

    	    //if the letter has already been correctly guessed, let the user know
    	    if (contains(wordDisplay, guess))
    	        System.out.println("You already guessed that letter.");

          
    	    //checking if the guessed letter is in the word
    	    for (int i = 0; i < wordLength; i++) {
    	        char letter = chosenWord.charAt(i);
    	        if (letter == guess)
    	            wordDisplay[i] = letter;
    	    }

    	    //printing out the letters currently in the array (correct guesses)
    	    for (char c : wordDisplay)
    		System.out.print(c + " ");
    	    
    	    //skipping a line
    	    System.out.println();
        
    	    //checking if user is wrong and removing 'lives' if so
    	    if (!contains(wordDisplay, guess)) {
    	        lives -= 1;
    	        if (lives == 0) {
    	            isGameOver = true;
    	            System.out.println("You lose.");
    	            System.out.println("The word was: " + chosenWord);
    	        }
    	        else
    	            System.out.printf("%s '%c' %s.\n", "Letter", guess, "was not in word. You lose a life");
    	    }
        
    	    //checking if the user has correctly guessed the word
    	    if (!contains(wordDisplay, '_')) {
    		isGameOver = true;
    		System.out.println("\nYou win!!");
    	    }
	}
    }
}