package tests;

import org.testng.annotations.Test;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 10/10/13
 * Time: 11:35 PM
 */
public class BaseTest {

    @Test
    public void likeTest() {
        SortedSet<String> sortedSet = new TreeSet<String>();
        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("a");
        System.out.print(sortedSet);
        /**
         * XyeTa   22
         */

    }

}
