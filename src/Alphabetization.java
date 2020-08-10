import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabetization {
     /**
     * Given: A list of email addresses, strip out and capitalize names, then alphabetize
     */
    public static List<String> rawEmails = Arrays.asList("Jeff.Bezos@asdf.com","Jim.Johnson@asdf.com","Kim.Adams@asdf.com", "Shaka.Zulu@asdf.com", "John.Smith@asdf.com") ;
    public List<String> finalNameList = new ArrayList<>();
    public static List<String> unAlphabetizedNameList = new ArrayList<>();


    public static void main(String[] args) {
        unAlphabetizedNameList = nameStripper(rawEmails);

    }

    public static List<String> nameStripper(List<String> emailList){
        List<String> strippedNames = new ArrayList<>();

        for(String email : emailList) {
            String tempString1 = "asdf" ;//Strip everything before @ symbol
            String tempFirstName = "asdf" ;// Strip tempString1 before period
            String tempLastName = "asdf" ;// Strip tempString1 after period

            String strippedFullName = tempFirstName + " " + tempLastName ;
            strippedNames.add(strippedFullName);
        }

        return strippedNames;
    }

    public static List<String>  alphabetization(List<String> nameList){
        List alphabetizedNames = new ArrayList<>();

        for(String name : nameList) {


        }

        return alphabetizedNames;
        /*
         String names[] = new String[n];

         for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
         */
    }
}
