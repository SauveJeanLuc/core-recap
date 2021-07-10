package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/** Java program to extract a portion of a array list
 * @author SAUVE Jean-Luc
 * @version 1.0
 */
public class PortionArrayList {

    public static void main(String[] args) {
        //Create an Array List
        List<String> finalList = new ArrayList<String>();

        //Ask User to input
        finalList.add("Peter");
        finalList.add("Patrick");
        finalList.add("Pazzo");
        finalList.add("Leandre");
        finalList.add("Ndisanze");

        //Ask user the portion to select from
        int begin = 1;
        int end = 3;

        for(int i=begin; i<=end; i++) {
            System.out.println(finalList.toArray()[i]);
        }

    }
}
