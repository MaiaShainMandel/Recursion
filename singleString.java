/* The singleString class will make a method that will 
 * show the proper use of recursion methods in reversing a set of strings.
 *
 * @author Maia Mandel
 * @version 1 2019.04.15
 */
import java.util.Scanner;
public class singleString
{
 
/* singleString () stores a single string input until a period is entered.
     *  Variables
     * <b>word</b> holds the string that needs to be checked*/
    public static String reverseString (String word)
    {
      if (word.equals(".\n"))
        return word.substring(0, 1);
      return reverseString (word.substring (word.indexOf ("\n")+1)) + "\n"  + word.substring (0, word.indexOf ("\n"));
    }

/*The main method actually runs the program and uses a while loop to 
 * make the program stop once a period has been entered.
  *  Variables
     * <b>word</b> holds the string that needs to be checked
     * <b>reverseWords</b> holds all the strings that have been entered*/
    public static void main (String[] args)
    {
      Scanner s = new Scanner (System.in);
      String reverseWords = "";
      String word = "";
      while (!word.equals("."))
      {
      word = s.nextLine ();
      reverseWords += word + "\n";
      }
      s.close();
      System.out.println (reverseString(reverseWords));
    } // main method 
} // singleString class
