public class FunWithStrings {
    //38. Write a Java program to count the letters, spaces, numbers and other characters of an input string
    //done
    //58. Write a Java program to capitalize the first letter of each word in a sentence.
    //done
    //59. Write a Java program to convert a given string into lowercase.
    //done
    //60. Write a Java program to find the penultimate (next to last) word of a sentence.
    //done
    //61. Write a Java program to reverse a word.
    //done
    //Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above
    //done
    // Write a Java program to extract the first half of a string of even length
    //ALSO TODO Sanitize input






    public static void main(String[] args){
        characterCounter("Caitlin Sucks Hairy Donkey balls 69 #420 #YOLO !@#$");
        firstLetterCapitalizer("i don't know what the eff i am doing");
        AllLetterLowercaser("Jesus Butt Fucking Christ, I need a job.");
        SecondToLastWord("asdf asdf asdf qwerrty asdf");
        LetterReverser("abcdefghijklmnopqrstuvwxyz");
        quadCity("123");
        quadCity("12");
        tDubbs("Go Hang A Salami, I'm a Lasagna hog!");
        tDubbs("12345");

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

    public static void AllLetterLowercaser(String input){
        char[] myCharArray = input.toCharArray();

        for (int i = 0; i< myCharArray.length ; i++) {
            myCharArray[i] = Character.toLowerCase(myCharArray[i]);
        }

        System.out.println(String.valueOf(myCharArray));
    }

    public static void SecondToLastWord(String input){
        String[] splitArray = input.split("\\s");
        System.out.println(splitArray[splitArray.length-2]);
    }

    public static void LetterReverser(String input){
        char[] myCharArray = input.toCharArray();
        char[] myReverseArray = new char[myCharArray.length];

        for (int i = 0; i< myCharArray.length ; i++) {
            myReverseArray[myCharArray.length - (i +1)] = myCharArray[i];
        }

        System.out.println(String.valueOf(myReverseArray));
    }

    public static void quadCity(String input){
        if(input.length() > 2){
            String tempString = input + input + input + input;
            System.out.println("Quadrupled string with a minimum length of 12 chars is: " + tempString);
        }
        else {
            System.out.println("Ya Done Goofed");
        }
    }

    public static void tDubbs(String input){
        if (input.length()%2==0){
            char[] myCharArray= input.toCharArray();
            char[] myHalvedArray = new char[input.length()/2];
            for(int i =0; i< input.length()/2; i++){
                myHalvedArray[i]= myCharArray[i];
            }

            System.out.println(String.valueOf(myHalvedArray)+String.valueOf(myHalvedArray));
        }
        else{
            System.out.println("Am I a joke to you?");
        }
    }



}
