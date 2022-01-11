/* @Author Joe Bofani
 * @Since 11/7/2020
 * CS 324-3
 * Programming Project #2
 * Floyd2 Algorithm w/ assisting methods
 * */

public class BofaniFloyd extends BofaniData
{
  static int count = 0;
    
  public static int[][] floyd2 (int W [][])  //outputs P matrix indicating highest intermediate vertex
  {
    int n = W.length;
    int D[][] = new int[n][n];
    int i,j,k;
    int P[][] = new int[n][n];
    
    for (i=0; i < n; i++)  //Initialization: sets P[][]=-1 & updates D=W
    {
      for (j=0; j < n; j++)
      {
        P[i][j] = -1;  //-1 indicates no intermediate vertex
        D[i][j] = W[i][j];  
      }
    }
    
    for (k=0; k < n; k++)  //Updates P & D matrices
    {
      count++;
      for (i=0; i < n; i++)
      {
        count++;
        for (j=0; j < n; j++)
        {
          count++;
          if (D[i][k] + D[k][j] < D[i][j])
          {
            P[i][j] = k;
            D[i][j] = D[i][k] + D[k][j];
          }
        }
      }
    }
    return(P);  //outputs a matrix where all values are 1 less than actual value (b/c all values were initialized to -1)
  }
  
  public static void printPath(int P[][], int q, int r)  //prints out ENTIRE shortest path
  {
    System.out.print("The shortest path from " + q +
                     " to " + r + " is: (" + "V" + q + ", ");
    path(P, q-1, r-1); //-1 becasue P matrix is 1 less than inputted value
    System.out.print("V" + r + ")");
    System.out.println("\n\nCounted number of steps = " + count);
    count =0;
  }
  
  public static void path (int P[][], int q, int r)  //prints out ONLY intermediate vertics of shortest path
  { 
    if (P[q][r] != -1)
    {
      path(P, q, P[q][r]);
      System.out.print("V" + (P[q][r] + 1) + ", "); //+1 becasue P matrix is 1 less than inputted value
      path(P, P[q][r], r);                  
    }
  }
  
  public static void printMatrix(int[][] matrix)  //prints out 2D arrays as matrices
  {
    for (int i = 0; i < matrix.length; i++) 
    {
      for (int j = 0; j < matrix.length; j++) 
      {
        if (matrix[i][j] == -1)  //determines if the matrix is a P matrix from floyd2()
        {
          printMatrix(plusOne(matrix));  ////plusOne() called becasue P matrix is 1 less than inputted value
          return;  
        }
        else if(matrix[i][j] >= 1000000)
        {
          System.out.print("INF, ");
        }
        else
        {
          System.out.print((matrix[i][j]) + ", ");
        }
      }
      System.out.println(); //creates rows
    }
    System.out.println();
  }
  
  public static int[][] plusOne(int[][] matrix) //adds +1 to all elements of a 2D array
  {
    for (int i = 0; i < matrix.length; i++) 
    {
      for (int j = 0; j < matrix.length; j++) 
      {
        matrix[i][j] += 1;
      }
    }
    return(matrix);
  }
}