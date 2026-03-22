import java.sql.Array;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{-1,0,3,5,9,12} ;
        int target = 9;
        System.out.println(bs.search(arr, target));
    }

    public int search(int[] nums, int target) {
        int n = nums.length ;
        int left = 0 ;
        int right = n-1 ;
        while(left<=right){
            int mid = (left+right)/2 ;
            if(nums[mid]== target) return mid ;
            else if(nums[mid]<target){
                left = mid+1 ;
            }
            else{
                right = mid-1;
            }
        }

        return -1 ;
    }
}
// Question Link => https://leetcode.com/problems/binary-search/