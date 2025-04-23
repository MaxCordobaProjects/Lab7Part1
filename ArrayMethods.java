import java.util.Arrays;
/**
 * This class contains a number of methods to compute and display information
 * about an array.
 * @author Max Cordoba, mcordoba002@student.sdccd.edu
 * @version 1.0, 4/22/25
 */
public class ArrayMethods
{
   int[] myArray = {7,8,8,3,4,9,8,7};
   /**
    Calculates the size of myArray
    @return the size
    */
   public int count() {
       int size = 0;
       for(int x : myArray) {
           size++;
       }
       return size;
   }
   /**
    Calculates the sum of the integers in myArray
    @return the sum
    */
   public int sum() {
       int total = 0;
       for(int x : myArray) {
           total += x;
       }
       return total;
   }
   /**
    Calculates the average of the integers in myArray
    @return the average
    */
   public double average() {
       return (double)sum() / count();
   }
   /**
    Finds the largest integer in myArray
    @return the largest integer
    */
   public int findMax() {
       int biggest = myArray[0];
       for(int x : myArray) {
           if(x > biggest) {
               biggest = x;
           }
       }
       return biggest;
   }
   /**
    Finds the index of the largest integer in myArray
    @return the index of the largest integer in myArray
    */
   public int findIndexOfMax() {
       int count = 0;
       int finalCount = 0;
       for(int x: myArray) {
           if(x == findMax()) {
               finalCount = count;
           }
           count++;
       }
       return finalCount;
   }
   /**
    Finds the last index of the integer key in myArray
    @param key int that is inputted
    @return the last index of the integer key in myArray
    */
   public int findLast(int key) {
       int index = -1;
       for(int x = myArray.length - 1; x >= 0; x--) {
           if(myArray[x] == key) {
               index = x;
               return index;
           }
       }
       return index;
   }
   /**
    Creates a new array with the indexes of all int key's in myArray
    @param key int that is inputted
    @return the new array with the indexes of all int key's in myArray
    */
   public int[] findAll(int key) {
       int count = 0;
       for(int x: myArray) {
           if(x == key) {
               count++;
           }
       }
       int newCount = 0;
       int[] newArray = new int[count];
       for(int x = 0; x < myArray.length; x++) {
           if(myArray[x] == key) {
               newArray[newCount] = x;
               newCount++;
           }
       }
       return newArray;
   }
   /**
    Gets the array
    @return the array
    */
   public int[] getArray() {
       return myArray;
   }
   /**
    Creates a copy of myArray
    @return the copy of myArray
    */
   public int[] copyArray() {
       int[] copyOfMyArray = Arrays.copyOf(myArray, myArray.length);
       return copyOfMyArray;
   }
   /**
    prints an int array, nicely formatted
    @param inArray int array to print
    */
    public void print(int[ ] inArray) {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++) {
            System.out.print(inArray[i] + ", ");
        }
        if (inArray.length > 0) {
            System.out.print(inArray[i]);
        }
        System.out.println("}");
    }
}
