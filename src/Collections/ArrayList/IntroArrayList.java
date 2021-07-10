package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/** Java program to create a new array list, add some elements and print out the collection
 * @author SAUVE Jean-Luc
 * @version 1.0
 */

public class IntroArrayList {

    public static void main(String[] args) {
        List<String> userList = new ArrayList<String>();

        userList.add("Mukamana");
        userList.add("Peter");
        userList.add("Parker");
        userList.add("Mahomi");

        System.out.println(userList);
    }

}
