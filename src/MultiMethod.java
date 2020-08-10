import java.util.ArrayList;

public class MultiMethod {
    /**
     * Objectives
     * instantiate shared variable, manipulate and preserve it in several different methods
     * Do a loop for(String mystring : inputStringArray){
     *
     * }
     *
     */
    public static void main(String[] args){
        ArrayList<Integer> myOutputArray = factorInput(5);
        System.out.println(myOutputArray);
        myOutputArray = modInput(myOutputArray);
        System.out.println(myOutputArray);
    }

    public static ArrayList<Integer> modInput(ArrayList<Integer> inputArray){
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i < inputArray.size(); i++){
            myArray.add(inputArray.get(i)%2);
        }
        return myArray;
    }

    public static ArrayList<Integer> factorInput(int input){
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            myArray.add(i*input);
        }
        return myArray;
    }



}
