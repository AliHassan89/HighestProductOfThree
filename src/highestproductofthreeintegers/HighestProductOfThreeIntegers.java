/*

Given an array of integers, find the highest product you can get from three of 
the integers. The input arrayOfInts will always have at least three integers.

 */
package highestproductofthreeintegers;

/**
 *
 * @author Ali
 */
public class HighestProductOfThreeIntegers 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = {1, -4, 3, -6, 7, 0 };
        System.out.println(calcHighestProduct(arr));
    }
    
    /*
    
    Solution:
    O(n) Time, O(1) Space

    - Scan the array and compute Maximum, second maximum and third maximum 
    element present in the array.
    - Scan the array and compute Minimum and second minimum element present in 
    the array.
    - Return the maximum of product of Maximum, second maximum and third maximum 
    and product of Minimum, second minimum and Maximum element.
    
    */
    
    private static int calcHighestProduct(int[] arr)
    {
        if (arr.length < 3)
            return -1;
        
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        
        for (int i=0; i<arr.length; i++)
        {
            if (maxA < arr[i])
            {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }
            
            else if (maxB < arr[i])
            {
                maxC = maxB;
                maxB = arr[i];
            }
            
            else if(maxC < arr[i])
            {
                maxC = arr[i];
            }
            
            if (minA > arr[i])
            {
                minB = minA;
                minA = arr[i];
            }
            else if (minB > arr[i])
            {
                minB = arr[i];
            }
        }
        
        return Math.max(maxA*maxB*maxC, minA*minB*maxA);
    }
    
}
