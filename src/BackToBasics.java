public class BackToBasics {
    //45. Write a Java program to find the size of a specified file.

    public static void main(String[] args) {
//        MultiplicationTable(8);
//        System.out.println("125 Mod (is the remainder of) 24 = " + 125%24);
//        PerimeterAndAreaOfACircle(7);
//        AverageCalculator(4,6,12);

//        StringReverser("xof nworb kciuq ehT");
        threesAndFives();
    }

    public static void MultiplicationTable(int mainNumber){
        for (int i=1; i<11 ; i++){
            System.out.println(i + " X " + mainNumber + " = " + (mainNumber * i));
        }
    }

    public static void PerimeterAndAreaOfACircle(int radius){
        //A=pi*r^2
        //C=2πr
        System.out.println("The Area of a circle with radius of: " + radius + " = " + Math.PI*(Math.pow(radius, 2)));
        System.out.println("The Circumference of a circle with radius of: " + radius + " = " + Math.PI*radius*2);


    }

    public static void AverageCalculator(int num1, int num2, int num3){

        System.out.println("The average of the tree numbers: "+num1+", "+num2+", "+num3+" = " + (num1+num2+num3)/3);
    }

    public static void StringReverser(String inputString){
        char[] reverseArray = new char[inputString.length()];
        for(int i = 0; i < inputString.length() ; i++){
            reverseArray[inputString.length() - i - 1] = inputString.charAt(i);
        }
        String reversedString =  String.copyValueOf(reverseArray);

        System.out.println(reversedString);
    }

    //n+nn+nnn
    public static void Eleventy(int num){
        System.out.println(num + " + " + num*11 + " + " +num*111);
    }
    //print all odds
    public static void printAllOdds(){
        for(int i = 1 ; i < 101 ; i ++ ){
            if(i%2>0){
                System.out.println(i);
            }
        }
    }
    //oddDetector
    public static void oddDetector(int input){
        if (input%2==0){
            System.out.println("The number you have entered is even");
        }
        else {
            System.out.println("The number you have entered is odd");
        }
    }

    public static void threesAndFives(){
        for(int i=0; i<101; i++){
            if(i%3==0 && i%5==0){
                System.out.println("The number " + i + " is divisible by 3 and 5");
            }
            else if(i%3==0 && i%5>0){
                System.out.println("The number " + i + " is divisible by 3 and not divisible by 5");
            }
            else if(i%3>0 && i%5==0){
                System.out.println("The number " + i + " is divisible by 5 and not divisible by 3");
            }
            else{
                System.out.println("****************************YOLO****************************");
            }

        }

    }

}
