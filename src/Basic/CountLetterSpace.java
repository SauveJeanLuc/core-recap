package Basic;

import java.util.Scanner;

/** Java program to count the letters, spaces, numbers and other characters of an input string
 * @author SAUVE Jean-Luc
 * @version 1.1
 */
public class CountLetterSpace {

    public static void main(String[] args){
        String textToProcess;

        Integer numOfLetters = 0;
        Integer numOfSpaces = 0;
        Integer numOfNumbers = 0;
        Integer numOfSpecialCharacters = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any text: ");
        textToProcess = in.nextLine();

        // Convert String to Character to be able to do operations easily
        char[] testChar = textToProcess.toCharArray();

        System.out.println("Text you Entered: "+textToProcess);

        // Entering the processing unit
        for(char item : testChar){
            if(Character.isLetter(item)){
                numOfLetters++;
            }
            else if(Character.isDigit(item)){
                numOfNumbers++;
            }
            else if(Character.isSpaceChar(item)){
                numOfSpaces++;
            }
            else{
                numOfSpecialCharacters++;
            }
        }

        System.out.println("Number of letters: "+numOfLetters);
        System.out.println("Number of spaces: "+numOfSpaces);
        System.out.println("Number of numbers: "+numOfNumbers);
        System.out.println("Number of special characters: "+numOfSpecialCharacters);

    }


}
