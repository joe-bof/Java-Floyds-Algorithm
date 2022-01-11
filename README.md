# Java-Floyds-Algorithm
Java program that uses Floyd's algorithm to find the shortest path in a weighted graph.


@Author Joe Bofani
@Since 11/7/2020

To run call: Use the printPath() method for any graph plugged into floyd2()  Ex:  pritPath( floyd2( graph ) )

The floyd2() method produces an array P of the highest intermediate vertex between all pairs of verticies (-1 if there are no intermediate verticies) for graphs.
The path() method produces all intermediate vertices on the shortest path b/w any two inputted vertices.
The printPath() method adds on the initial and end vertices to the shortest path of the b/w the inpiutted vertices.
The printMatrix() method converts 2D arrays into a printed matrix.
The plusOne() method increments all of floyd2()'s P array elements by +1, becasue of the -1 initialization of all elements.
There's a timer output that times the execution of all methods working in unison.
There's a count output that counts the number of steps the algorithm takes (should be near "n in order of n^3").
Takes an input of an adjacency matrix (Ex: the 1st matrix in the output).

Example output:

   Adjacency Matrix W:
   0, 1, INF, 1, 5, 
   9, 0, 3, 2, INF, 
   INF, INF, 0, 4, INF, 
   INF, INF, 2, 0, 3, 
   3, INF, INF, INF, 0, 

   Floyd2 matrix P:
   0, 0, 4, 0, 4, 
   5, 0, 0, 0, 4, 
   5, 5, 0, 0, 4, 
   5, 5, 0, 0, 0, 
   0, 1, 4, 1, 0, 

   The shortest path from 3 to 2 is: (V3, V4, V5, V1, V2)

   Counted number of steps = 310

   Time to execute Floyd's Algorithm = 62.00ms


Files Included:

  - BofaniFloydApp.java --> application class.
  - BofaniFloyd.java --> Floyd's algorithm.
  - BofaniData.java --> contains graph data.
  - README.md --> README file with text description of program.
