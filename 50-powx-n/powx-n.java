class Solution {
    public double myPow(double x, int n) {
        double ans=1;int m=n;       if (n == Integer.MIN_VALUE) {
            x *= x;
            n /= 2;
        }
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-1*n;
        }
       while(n>0){
if(n%2==1){ans=ans*x;
n=n-1;}else{
       n=n/2;x*=x;
        }} if(m<0){
            return 1.0/ans;
        }return ans;   }
}