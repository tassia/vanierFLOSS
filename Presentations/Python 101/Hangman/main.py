# -*- coding: utf-8 -*-
"""
Created on Fri Feb 26 14:17:42 2021

MIT License Copyright (c) 2021 Giuliana Bouzon

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

@author: Giuliana Bouzon
The actual code for the Hangman game
"""

#instead of import, we can do: 
#from hangman_art import logo, stages

import random
import hangman_words
import hangman_art

#printing the hangman logo at the start of the game
print(hangman_art.logo)

#choosing a random word from the word list 
chosen_word = random.choice(hangman_words.word_list)

#getting length of the chosen word ^^
word_length = len(chosen_word)

end_of_game = False
lives = 6

#Create blanks
display = []
for character in range(word_length):
    display += "_"

#keeps prompting user to enter a letter while the user hasn't lost/won
while not end_of_game:
    guess = input("Guess a letter: ").lower()
  
    #if the letter has already been correctly guessed, let the user know
    if guess in display:
      print("You already guessed that letter.")

    #Check guessed letter
    for position in range(word_length):
        letter = chosen_word[position]
        if letter == guess:
            display[position] = letter

    #printing hangman art after each try
    print(hangman_art.stages[lives])

    #Join all the characters in the list and turn it into a String (to display the whole word)
    print(f"{' '.join(display)}\n")

    #Check if the user's guess is wrong
    if guess not in chosen_word:
        lives -= 1
        if lives == 0:
            end_of_game = True
            print("You lose.")
            print("The word was: " + chosen_word);
        else:
          print(f"Letter '{guess}' not in word. You lose a life.")

    #Check if user has got all letters.
    if "_" not in display:
        end_of_game = True
        print("You win.")