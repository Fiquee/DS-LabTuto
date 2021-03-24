/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto1;

/**
 *
 * @author Forge-15 i7
 */
public class Sentence {

    private String sentence;
    private int length, vowels, words;

    @Override
    public String toString() {
        return "The sentence is : " + sentence +
                "\nThe length of the sentence : " + getlength() + 
                "\nThe number of vowels : " + getVowels() + 
                "\nThe number of words : " + getWords();
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public int getlength() {
        length = sentence.length();
        return length;
    }

    public int getVowels() {
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vowels++;
            }
            
        }
        return vowels;
    }
    public int getWords(){
        String[] count = sentence.split(" ");
        words = count.length;
        return words;
    }
    
}
