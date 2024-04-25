class Solution {
    public int countPrimes(int n) {
        boolean arr[] =new boolean[n+1];
        // n+1 as it  will create an extra space for 0 index by shifting one ahea we will get i=2 for 2 value if not had n+1 we would get 3 
        int count=0;
        for(int i=2;i< n;i++){
            arr[i]=true;
        }if(n<3){
            return 0;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }for(int i=2;i<n;i++){
            if(arr[i]==true){
                count++;
            }
        }
     return count;  }
}
        