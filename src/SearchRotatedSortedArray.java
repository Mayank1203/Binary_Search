public class SearchRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0 ;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l<=h)
        {
            int mid = (h+l)/2;
            if(nums[mid]==target) return true;
            if(nums[l]==nums[mid] && nums[mid]==nums[h])
            {
                l++;
                h--;
                continue;
            }
            if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && nums[mid]>=target)
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && nums[h]>=target)
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
        }
        return false;
    }
}
// Question Link => https://leetcode.com/problems/search-in-rotated-sorted-array-ii/