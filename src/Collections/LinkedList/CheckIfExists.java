package Collections.LinkedList;


import java.util.LinkedList;
import java.util.List;

/** Java program to check if a particular element exists in a linked list
 * @author SAUVE Jean-Luc
 * @version 1.0
 */

public class CheckIfExists {

    public static void main(String[] args) {
        //Create the LinkedList
        List<String> forChecking = new LinkedList<String>();

        //Ask user to fill the List
        forChecking.add("One");
        forChecking.add("Two");
        forChecking.add("Three");
        forChecking.add("Four");
        forChecking.add("Five");

        //Require key
        String key ="Foura";
        int indexFound = -1;
        if (forChecking.contains(key)) {
            System.out.println("Yes The list contains: "+key+" in itself.");
        }
        else{
            System.out.println("Sorry, Key not found😢");
        }


    }

}
