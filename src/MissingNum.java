public class MissingNum {

    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
        public static int missingNumber(int[] nums) {

            int sum = 0 ;
            for(int i =0 ; i<nums.length ; i++){
                sum = sum + nums[i];
            }

            int ActualSum = (nums.length*(nums.length+1)/2);

            int MissingNo = ActualSum - sum ;

            return MissingNo ;

        }
}
// Question Link => https://leetcode.com/problems/missing-number/