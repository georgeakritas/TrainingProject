import java.util.Arrays;

public class FunWithStrings {
    //38. Write a Java program to count the letters, spaces, numbers and other characters of an input string
    //done
    //58. Write a Java program to capitalize the first letter of each word in a sentence.
    //done
    //59. Write a Java program to convert a given string into lowercase.
    //60. Write a Java program to find the penultimate (next to last) word of a sentence.
    //61. Write a Java program to reverse a word.


    public static void main(String[] args){
        characterCounter("Caitlin Sucks Hairy Donkey balls 69 #420 #YOLO !@#$");
        firstLetterCapitalizer("i don't know what the eff i am doing");
    }

    public static void characterCounter(String input){
        int letterCounter=0;
        int spaceCounter=0;
        int specialCharacterCounter=0;
        int numberCounter=0;

        char[] myCharArray = input.toCharArray();
        for (char myChar : myCharArray){
            if(Character.isLetter(myChar)){
                letterCounter++;
            }
            else if(Character.isSpaceChar(myChar)){
                spaceCounter++;
            }
            else if(Character.isDigit(myChar)){
                numberCounter++;
            }
            else{
                specialCharacterCounter++;
            }
        }
        System.out.println("The input string " + input);
        System.out.println("Contains " + letterCounter + " letters");
        System.out.println("Contains " + spaceCounter + " spaces");
        System.out.println("Contains " + specialCharacterCounter + " Special Characters");
        System.out.println("Contains " + numberCounter + " numbers");
    }

    public static void firstLetterCapitalizer(String input){
        char[] myCharArray = input.toCharArray();
        for (int i = 0; i< myCharArray.length ; i++){
            if(i==0){
                myCharArray[i] = Character.toUpperCase(myCharArray[i]);
            }
            if(Character.isSpaceChar(myCharArray[i])){
                myCharArray[i+1] = Character.toUpperCase(myCharArray[i+1]);
            }
        }
        System.out.println(myCharArray);
        System.out.println(String.valueOf(myCharArray));
    }

}
