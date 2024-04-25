class Solution {
    public int countPrimes(int n) {
        boolean arr[] =new boolean[n+1];
        // n+1 as it  will create an extra space for 0 index by shifting one ahea we will get i=2 for 2 value if not had n+1 we would get 3 
        int count=0;
        // n= arr.length-1 =12 2 se 12 tak chalega 
        for(int i=2;i< n;i++){
            arr[i]=true;
        }// exception case
        if(n<3){
            return 0;
        }
        // 2 se root tak n ke baki sb cover ho jayenge n=25, 2,3,4,5
        // 2 ke table cover hojayenge 2 pahle se true fir ye sb false,4 ,6,8,10,12,14,16,18,20,22,24
        // 3 ke cover hojayenge 3 pahle se , fir 9 , 12,15,18,21,24
        // 4 false ho gya skip 
        // 5 sidhe 25 kardega jiska koi kam ni
        for(int i=2;i*i<n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<n;j+=i){
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
        