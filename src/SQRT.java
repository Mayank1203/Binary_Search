public class SQRT {
    public static void main(String[] args){
        int x = 1064 ;

        SQRT obj = new SQRT();
        System.out.println(obj.mySqrt(x));
    }
        public int mySqrt(int x) {
            if(x<2) return x ;

            int low = 1 ;
            int high = x/2 ;
            int result = 0 ;

            while(low<=high){
                int mid = low+(high-low)/2 ;

                long square = (long)mid*mid ;

                if(square==x){
                    return mid ;
                }else if(square<x){
                    result = mid ;
                    low = mid + 1 ;
                }else{
                    high = mid - 1;
                }
            }

            return result ;
        }
    }
// Question Link => https://leetcode.com/problems/sqrtx/