public class FunWithMaths {
    /**Sum digits of an integer*/
    /**Compare two digits*/
    //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
    // Also count how many three-digit numbers are there.
    //Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number
    //57. Write a Java program to accepts an integer and count the factors of the number. Go to the editor
    public static void main(String[] args){
        System.out.println(sumTwoDigits(575));
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
        int[] myIntArray = new int[]{1, 2, 3, 4};
        for (int i=0; i<4; i++){
            if(i==0){
                System.out.println(myIntArray[0] + myIntArray[1] );
            }
        }

    }
}
