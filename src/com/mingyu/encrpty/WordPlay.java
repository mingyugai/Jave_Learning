
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Character;

public class WordPlay {
    public boolean isVowel(char ch){
        if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||
        ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            return true;
         }
         else {
             return false;
         }
   }
   public void tester1(){
       char ch ='A';
       System.out.println(isVowel(ch));
       ch = 'R';
       System.out.println(isVowel(ch));
       ch = 'e';
       System.out.println(isVowel(ch));
    }
   public String replaceVowels(String phrase, char ch){
       StringBuilder input = new StringBuilder(phrase);
       for (int i = 0; i < input.length(); i++){
           char currChar = input.charAt(i);
           if (isVowel(currChar) == true){
               char newChar = ch;
               input.setCharAt(i, newChar);
            }
        }
       return input.toString();
    }
   public void tester2(){
        System.out.println(replaceVowels("Hello World", '*'));
    }
   public String emphasize(String phrase, char ch){
       StringBuilder str = new StringBuilder(phrase);
       for (int i =0; i < str.length(); i++){
           char currChar = str.charAt(i);
           if (i % 2 != 0 && (currChar == ch ||Character.toLowerCase(currChar) == ch)){
               str.setCharAt(i, '+');  
            }
           if (i % 2 == 0 && (currChar == ch ||Character.toLowerCase(currChar) == ch)){
               str.setCharAt(i, '*');   
            } 
        }
       return str.toString();
    }
   public void tester3(){
       System.out.println(emphasize("dna ctgaaactga", 'a'));
       System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
}

