public class FunWithMaths {
    /**Sum digits of an integer*/
    /**Compare two digits*/
    //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
    // Also count how many three-digit numbers are there.
    //Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number
    //57. Write a Java program to accepts an integer and count the factors of the number. Go to the editor\
    ///69. Largest prime factor
    //86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.

    public static void main(String[] args){

        System.out.println(sumTwoDigits(575));
        digitComparer(656, 546);
        first100Primes();
        doubleTriple(43);

    }

    public static int sumTwoDigits(int input){
        int sum = 0;
        Integer tempint = input;
        int numberOfDigits = tempint.toString().length();
        for (int i=0; i < numberOfDigits; i++){
           sum += Character.getNumericValue(tempint.toString().charAt(i));
        }
        return sum;
    }

    public static int rectangleArea(int height, int width){
        int area = height * width;
        if(height == width){
            System.out.println("That Rectangle is a square");
        }
        return area;
    }

    public static int rectanglePerimeter(int height, int width){
        int perimeter = (2 * height) + (2 * width) ;
        if(height == width){
            System.out.println("That Rectangle is a square");
        }
        return perimeter;
    }

    public static void intComparison(int input1, int input2){
        if(input1 > input2){
            System.out.println(input1 + " is greater than " + input2);
        }
        if(input1 < input2){
            System.out.println(input2 + " is greater than " + input1);
        }
        if(input1 == input2){
            System.out.println("The inputs you provided are equal");
        }
    }

    public static void digitCombine(){
        //TODO rework this, ensure unique combinations
        //TODO maybe nested loops with an array to validate uniqueness
        int[] myIntArray = new int[]{1, 2, 3, 4};
        for (int i=0; i<4; i++){
            if(i==0){
                System.out.println(myIntArray[0] + myIntArray[1] );
            }
        }

    }

    public static void digitComparer(Integer input1, Integer input2){
        String tempString1 = input1.toString();
        String tempString2 = input2.toString();
        char[] tempChar1 = tempString1.toCharArray();
        char[] tempChar2 = tempString2.toCharArray();
        for(int i = 0; i<tempChar1.length; i++){
            for(int j =0; j<tempChar2.length; j++){
                if(tempChar1[i]==tempChar2[j]){
                    System.out.println("A Digit matched " + tempChar1[i] +" of " + input1 + " and " + input2);
                }
            }
        }
    }

    public static void first100Primes(){
        int primeCounter = 0;
        for(int i = 1; primeCounter < 101; i++){
            int denominatorrCounter = 0;
            for(int j =1; j<(i+1);j++){
                if(i%j==0){
                    denominatorrCounter++;
                }
            }
            if(denominatorrCounter==2){
                System.out.println("Prime number detected " + i);
                primeCounter++;
            }
        }
    }

    public static void doubleTriple(int input){
        System.out.println("Input currently is: " + input);
        if(input==1){
            System.out.println("Success, n==1" );
        }
        else if(input%2==0){
            System.out.println("Input is even, Recursive Call using " +input/2 );
            doubleTriple(input/2);
        }
        else if(input%2>0){
            System.out.println("Input is even, Recursive Call using " + ((input*3)+1));
            doubleTriple((input*3)+1);
        }
    }
}
