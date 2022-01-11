/* @Author Joe Bofani
 * @Since 11/7/2020
 * CS 324-3
 * Programming Project #2
 * Application Class
 * */

import java.text.DecimalFormat;

public class BofaniFloydApp extends BofaniFloyd
{
  public static void main (String[] args)
  {
    DecimalFormat df = new DecimalFormat(".00");
    
    System.out.println("Adjacency Matrix W:");
    printMatrix(graph1);
    System.out.println("Floyd2 matrix P:");
    printMatrix(floyd2(graph1));
    final long start1 = System.currentTimeMillis();
    printPath(floyd2(graph1), 3, 2);
    final long end1 = System.currentTimeMillis();
    System.out.println("\nTime to execute Floyd's Algorithm = " + df.format(end1-start1) + "ms");
    //System.out.println("Number of steps = " + floyd2(graph1.count()));
    System.out.println("\n//////////////////////////////////////////////////////////////\n");   
    
    System.out.println("Adjacency Matrix W:");
    printMatrix(graph2);
    System.out.println("Floyd2 matrix P:");
    printMatrix(floyd2(graph2));
    final long start2 = System.currentTimeMillis();
    printPath(floyd2(graph2), 7, 3);
    final long end2 = System.currentTimeMillis();
    System.out.println("\nTime to execute Floyd's Algorithm = " + df.format(end2-start2) + "ms");
    System.out.println("\n//////////////////////////////////////////////////////////////\n");
    
    System.out.println("Adjacency Matrix W:");
    printMatrix(graph3);
    System.out.println("Floyd2 matrix P:");
    printMatrix(floyd2(graph3));
    final long start3 = System.currentTimeMillis();
    printPath(floyd2(graph3), 4, 2);
    final long end3 = System.currentTimeMillis();
    System.out.println("\nTime to execute Floyd's Algorithm = " + df.format(end3-start3) + "ms");
    System.out.println("\n//////////////////////////////////////////////////////////////\n");
    
    System.out.println("Adjacency Matrix W:");
    printMatrix(graph4);
    System.out.println("Floyd2 matrix P:");
    printMatrix(floyd2(graph4));
    final long start4 = System.currentTimeMillis();
    printPath(floyd2(graph4), 1, 10);
    final long end4 = System.currentTimeMillis();
    System.out.println("\nTime to execute Floyd's Algorithm = " + df.format(end4-start4) + "ms");
    System.out.println("\n//////////////////////////////////////////////////////////////\n");
    
    System.out.println("Adjacency Matrix W:");
    printMatrix(graph5);
    System.out.println("Floyd2 matrix P:");
    printMatrix(floyd2(graph5));
    final long start5 = System.currentTimeMillis();
    printPath(floyd2(graph5), 7, 6);
    final long end5 = System.currentTimeMillis();
    System.out.println("\nTime to execute Floyd's Algorithm = " + df.format(end5-start5) + "ms");
    System.out.println("\n//////////////////////////////////////////////////////////////\n");
  }
}