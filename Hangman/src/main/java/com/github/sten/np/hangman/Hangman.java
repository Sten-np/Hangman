package com.github.sten.np.hangman;
import java.util.Scanner;
/**
 *
 * @author sten
 */
public class Hangman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a word: \n");
        String word = scan.nextLine();
        
        Word wordObj = new Word(word);
        
        System.out.println("Guess a letter: \n");
        String letter = scan.nextLine();

        wordObj.checkLetter(letter);
    }
}
