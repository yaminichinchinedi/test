import java.math.MathContext;

public class LongestConsecuteElement {

    //Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
    //
    //For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.


    private static boolean arrayContains(int[] arr, int num){
        for (int i=0; i<arr.length; i++){
            if (arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int longestConsecutive(int nums[])
    {
        int longestStreak=-0;

        for(int num:nums){
            int currentNum=num;
            int currentStreak=1;

            while(arrayContains(nums, currentNum +1)){

                currentNum =+1;
                currentStreak =+1;
            }
            longestStreak= Math.max(longestStreak,currentStreak);
        }
        return longestStreak;
    }
    public static void main(String args[])
    {
        int arr[]= {100, 4, 200, 1, 3, 2};
        int num= arr.length;
        System.out.println("longest consucutive is "+longestConsecutive(arr));
    }
}
