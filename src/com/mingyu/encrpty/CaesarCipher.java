package com.mingyu.encrpty;
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaesarCipher {
    public static String encrypt(String input, int key){
	//TODO add a brief description to each fucntion. Search oneline for convetion
        StringBuilder encrypted = new StringBuilder(input);
	//TODO this is a static valid, put this to the front of class static.
	//TODO you can generate this string automatically by using a function.
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
	//TODO put this string to the front of the class as the same as alphabet
        String shiftedAlphabet = shiftAlphabet(key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
	    //TODO Put this comment above ths if condition. 
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    private static String shiftAlphabet(int key){
	//TODO use a function to generate
        String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = "abcdefghigklmnopqrstuvwxyz";
        //compute the shifted alphabet
        String shiftedAlphabet1 = alphabet1.substring(key) + alphabet1.substring(0,key);
        String shiftedAlphabet2 = alphabet2.substring(key) + alphabet2.substring(0,key);
        //concentrate these two strings
	//TODO add a space after "+"
        String allAlphabet = alphabet1 +alphabet2;
        String shiftedAlphabet = shiftedAlphabet1 + shiftedAlphabet2;
        return shiftedAlphabet;
    }

    public static String encryptTwoKeys(String input, int key1, int key2){
        StringBuilder encrypted = new StringBuilder(input);
	//TODO why do you define it here again
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
        String shiftedAlphabet = " ";
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            if (i % 2 == 0){
                shiftedAlphabet = shiftAlphabet(key1);
            }else{
                shiftedAlphabet = shiftAlphabet(key2);
            }
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int idx = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(idx != -1){
                //Get the idxth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(idx);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise: do nothing
        }
        return encrypted.toString();
    }

    public static void main(String args[]){
        String test = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        int key = 15;
        System.out.println(encrypt(test, key));
        System.out.println(encryptTwoKeys(test, 8, 21));
	//TODO remove extra line

    }
}
