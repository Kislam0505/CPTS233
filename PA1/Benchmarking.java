// Khairul Islam
// 09/18/2020
// CptS 233
// PA #1 - Benchmarking a LinkedList

import java.util.*;
import java.awt.*;
import java.io.*;

public class Benchmarking {
   public static void main(String args[]) throws FileNotFoundException {
      Scanner c = new Scanner(System.in);
      System.out.println("Starting up");
      System.out.print("Please enter a filename to read in: ");
      String inputFile = c.next();
      Scanner input = new Scanner(new File(inputFile));
      LinkedIntList list = new LinkedIntList(); 
      
      long startTime = 0;
      long endTime = 0;
      int size = 0;
      startTime = System.nanoTime(); //Start time to insert values
      while (input.hasNextInt()) {
         int data = input.nextInt();
         list.putSorted(data);
         size++;
      }
      endTime = System.nanoTime(); //End time to insert values
      long timeInsert = endTime - startTime;
      
      startTime = System.nanoTime(); //Start time to get maximum value
      int max = list.getMax();
      endTime = System.nanoTime(); //End time to get maximum value
      long timeMax = endTime - startTime;  
      
      startTime = System.nanoTime(); //Start time to get median value
      int med = list.getMed(size);
      endTime = System.nanoTime(); //End time to get median value
      long timeMed = endTime - startTime;
      
      startTime = System.nanoTime(); //Start time to get minimum value
      int min = list.getMin();
      endTime = System.nanoTime(); //End time to get minimum value
      long timeMin = endTime - startTime;
     
      printReport(max, med, min, size, timeInsert, timeMax, timeMed, timeMin, inputFile); 
   }
   
   public static void printReport(int max, int med, int min, int size, long timeInsert, 
                                  long timeMax, long timeMed, long timeMin, String file) { 
      System.out.println("You entered string " + file);
      System.out.println("The filename is: " + file);
      System.out.println("Processing file: " + file);
      System.out.println("....");
      System.out.println("...");
      System.out.println("..");
      System.out.println("Stats for data in file: " + file);
      System.out.println("Total Elements sorted: " + size);
      System.out.println("Min: " + min + " ns");
      System.out.println("Max: " + max + " ns");
      System.out.println("Med: " + med + " ns");
      System.out.println("Time Insert: " + timeInsert + " ns");
      System.out.println("Time Min: " + timeMin + " ns");
      System.out.println("Time Mix: " + timeMax + " ns");
      System.out.println("Time Med: " + timeMed + " ns");
      System.out.println("Done!");
   } 
   
}
