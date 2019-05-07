/* The SearchItem class will make a method that will 
 * show the proper use of recursion methods by searches for an object within a
 * comparable array and return true if it finds one - otherwise returning false.
 *
 * @author Maia Mandel
 * @version 1 2019.04.15
 */
import java.util.Arrays;
public class SearchItem
{
 
/* searchItem () stores a single string input until a period is entered.
     *  Variables
     * <b>arr</b> array that stores all the ints*
     * <b>e</b> Comparable that stores the int that you are searching the array for*/

    private static boolean searchItem (Comparable[]arr, Comparable e)
    {
 if (arr.length >0)
 {
     Comparable [] arr2 = new Comparable [arr.length-1];
     System.arraycopy (arr, 1, arr2, 0, arr.length-1);
     return arr[0].compareTo (e) == 0 || searchItem (arr2, e);
 }
 return false;
    }

/*The main method actually runs the program.*/
    public static void main (String [] args)
    {
 System.out.println (SearchItem.searchItem (new Integer [] {7, 2, 3}, 2) );
    }
} // SearchItem class
