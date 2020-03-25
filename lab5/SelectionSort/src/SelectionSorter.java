/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
*/
public class SelectionSorter
{
   /**
      Sorts an array, using selection sort.
      @param a the array to sort
   */
   public static void sort(int[] a)
   {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }

   private static int minimumPosition(int[] a, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minPos]) { minPos = i; }
      }
      return minPos;
   }
}