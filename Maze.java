/* The Maze class will make a method that will
 * do the fourth assignment in the recursive methods package.
 *
 * @author Maia Mandel
 * @version 1 2019.04.15
 */
import java.util.Arrays;
public class Maze {

  
/* mazeReturn () This method determines there is a pathway.
     *  Variables
     * <b>y</b> int that is the y coordinate*
     * <b>arr</b> int array that stores the coordinates to make the maze*
     * <b>x</b> int that is the x coordinate*/

    public static boolean mazeReturn (int [][] arr, int x, int y)
    {
 if (x == 4)
     return true;
 else if (x < 4 && arr[y+1][x] == 0)
 {
     arr[y][x]=8;
     return (mazeReturn(arr,y+1,x+1));
 }
 else if (arr[y][x+1] == 0 && x<4)
 {
     arr[y][x]=8;
     return (mazeReturn (arr,y,x+1));
 }
 else if (arr[y-1][x]==0 && y > 0)
 {
     arr[y][x] = 8;
     return (mazeReturn(arr,y-1,x));
 }
 else
     return false;
    }
/*The main method runs the program.*/
    public static void main (String [] args)
    {
 System.out.println (Maze.mazeReturn (new int [5][5], 0,0));
    }
}
