package com.github.sten.np.hangman;

/**
 *
 * @author sten
 */
public class Word {
    private final String word;
    
    public Word(String word) {
        this.word = word;
    }
    
    public boolean checkLetter(String letter) {
        if (this.word.contains(letter)) {
            return true;
        }  
        return false;
    }
}
