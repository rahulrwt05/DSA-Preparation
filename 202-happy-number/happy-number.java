class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = findSquare(n);

        while (slow != fast){
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }

        return slow==1;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
}
