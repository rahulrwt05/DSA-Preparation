class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        

        while (start <= end) {
            int mid = start+ (end - start) / 2;
//  Optimized Logic: You're using integer division x / mid to compare with mid instead of multiplying mid with itself, which could lead to integer overflow for large values of x. This makes your code more efficient and prevents overflow issues.
            if (x / mid == mid) {
                ans = mid;
                return ans;
            } else if (x / mid < mid) {
                end = mid - 1;
            } else if (x / mid > mid) {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}