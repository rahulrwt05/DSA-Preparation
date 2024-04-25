class Solution {
    public int countPrimes(int n) {
        boolean arr[] =new boolean[n+1];int count=0;
        for(int i=0;i< arr.length;i++){
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
        }for(int i=2;i<arr.length-1;i++){
            if(arr[i]==true){
                count++;
            }
        }
     return count;  }
}
        