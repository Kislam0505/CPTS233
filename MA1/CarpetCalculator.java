/*
Name: Khairul Islam
Cpts 233: Micro-Assignment 1
Date: 09/4/2020
GitRepo url: https://github.com/Kislam0505/CPTS233.git
*/
import java.util.Scanner; 

   public class CarpetCalculator {
   
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Get the length.
            System.out.print("Enter the length of the room: ");
            double L = input.nextDouble();

            // Get the width.
            System.out.print("Enter the width of the room: ");
            double W = input.nextDouble();

            // Get the cost of price per square feet of the desired carpeting.
            System.out.print("Enter the price for the desired carpeting: ");
            double carpetCost = input.nextDouble();
            
            RoomDimension roomD = new RoomDimension(L, W);
            RoomCarpet roomCarpet = new RoomCarpet(roomD, carpetCost);
            
            System.out.println(roomCarpet);
        }
    }