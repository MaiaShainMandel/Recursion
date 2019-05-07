/* The reverseDigits class will make a method that will 
 * show the proper use of recursion methods in reversing a set of string.
 *
 * @author Maia Mandel
 * @version 1 2019.04.15
 */

public class reverseDigits
{
 
/* revDigits () stores a single string input until a period is entered.
     *  Variables
     * <b>n</b> int that will have its numbers reversed*/
    public static int revDigits (int n)
    {
      if (n < 10)
        return n;
      return revDigits (n/10) + (n%10*(int)(Math.pow(10, (int)Math.log10(n))));
    }

/*The main method actually runs the program.*/
    public static void main (String[] args)
    {
      System.out.println (revDigits (345));
      System.out.println (revDigits (4));
    } // main method 
} // reverseDigits class