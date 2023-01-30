// Name: Manasse Bosango
// Reason: To make use of of nested for loop and avoid redundancy in coding

// The logic behind this code comes from https://youtu.be/TyjEpru8Am4

/**
 * It's a class that draws a picture of a space needle
 */
public class SpaceNeedle {
   static int needleSize = 5;

   /**
    * This function prints out the needle of the hourglass
    */
   public static void needlePoint() {
      // Assigning the number of rows the needle should be.
      // Less then or equal to needlesize constant so you can change the needlesize
      // and by the number of rows.
      for (int rows = 1; rows <= needleSize; rows++) {
         // This for loop is the number of spaces.
         // 3 times needlesize because 3 any number will be the number of spaces. So you
         // will be able to change the spaces with constant.
         for (int j = 1; j <= 3 * needleSize; j++) {
            System.out.print(" ");
         }
         // Once the space loop ends, it will print out "I|" and will keep going until
         // needlesize constant int stops.
         System.out.print("||");
         System.out.println();
      }
   }

   /**
    * The function will print the top of the dome
    */
   public static void topDome() {

      // The numbers of rows the dome lasts will be the constant.
      for (int rows = 1; rows <= needleSize; rows++) {
         // 3 times SIZE subtracting 3 times the rows will be the number of spaces put
         // before ".
         // For example, 3 4 (SIZE) 3 1 is 9. The number of spaces before the first ".
         for (int i = 1; i <= ((3 * needleSize) - (3 * rows)); i++) {
            System.out.print(" ");
         }

         // After the loop for spaces is over, it will print "_/".
         System.out.print("__/");

         // Depending on which row it's on, it wil1 print a certain amount of ":".
         // Since the first set of ":" are 3, then 3 rows - 3 will be the number of ":"
         // printed.
         for (int i = 1; i <= ((3 * rows) - (3)); i++) {
            System.out.print(":");
         }

         // After that loop is over, it will print "||" for the middle of the dome.
         System.out.print("||");
         // This is the same thing as above but in reverse and there are no spaces
         // needed.
         for (int i = 1; i <= ((3 * rows) - (3)); i++) {
            System.out.print(":");
         }
         System.out.print("\\__");
         System.out.println();
      }
   }

   /**
    * This function prints the middle of the dome
    */
   public static void middleDome() {
      // It is started with a "I".
      System.out.print("|");
      // This loop is to print 24 quotes but to have them be able to change, I did 6
      // SIZE.
      for (int i = 1; i <= 6 * needleSize; i++) {
         System.out.print("\"");
      }
      // Once the loop is over, you print another "|".
      System.out.print("|");
      System.out.println();
   }

   // Printing the lower dome of the space needle.
   public static void lowerDome() {
      // The rows will change as the constant does.
      for (int rows = 1; rows <= needleSize; rows++) {
         // Depending on what row it's on, it will print a certain amount of 1lines.
         // Since the first row has zero spaces, below, 2* rows (if rows is one)- 2 would
         // make zero spaces for the first row.

         for (int i = 1; i <= (2 * rows) - 2; i++) {
            System.out.print(" ");
         }

         System.out.print("\\_");
         // Each row has "/\" and it decreases by 2 each row.
         // For example 3 times 4 or SIZE + 1-2
         // As each row passes down, the "/\" decrease by two because of my equation.
         for (int j = 1; j <= (((3 * needleSize) + 1) - (2 * rows)); j++) {
            System.out.print("/\\");
         }
         // After the loop ends, it gets finished off.
         System.out.print("_/");
         System.out.println();
         // rows (1), just so when the rows change the numbers do, will be 11.
      }
   }

   /**
    * The function prints the body of the needle
    */
   public static void bodyOfNeedle() {
      String percentSign = "";
      // Since there are 16 rows in the 4 class constant model, I put lines <= SIZE
      // times SIZE to be 16.
      // So if SIZE is changed, it will do the same with any number.
      for (int lines = 1; lines <= needleSize * needleSize; lines++) {
         // I had to assign an empty string inside the loop.
         percentSign = "";
         // This loop add the number of spaces.
         // For example if SIZE is 5, then 3 times 5 - 3 will be 12, the number of spaces
         // before "|".
         for (int i = 0; i <= needleSize * 3 - needleSize + 1; i++) {
            System.out.print(" ");
         }

         // For example if SIZE is 4, then 4 / 2 would be 2, the number of "X" signs on
         // each side.
         // And if size is different number, that will change.
         for (int j = 1; j <= needleSize - 3; j++) {
            // System.out.print("");
            percentSign += "%";
         }
         // This is where the actual string is printed with the string variable.
         System.out.println("|" + percentSign + "||" + percentSign + "|");
      }
   }

   public static void main(String[] args) {
      // Calling the functions in the order that they are needed to be called.
      needlePoint();
      topDome();
      middleDome();
      lowerDome();
      needlePoint();
      bodyOfNeedle();
      topDome();
      middleDome();

   }
}
