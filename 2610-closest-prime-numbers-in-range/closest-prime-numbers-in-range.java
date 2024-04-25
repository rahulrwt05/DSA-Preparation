class Solution {
    public int[] closestPrimes(int left, int right) {
     boolean sieve[]=new boolean[right+1];
     ArrayList<Integer> primes=new ArrayList<Integer>();
     Arrays.fill(sieve,true);
     for(int i=2;i*i<=right;i++){
        if(sieve[i]==true){
            for(int j=i*i;j<=right;j+=i){
                sieve[j]=false;
            }
        }
     }// 2 se right tak sieve arraye se primes no left se right ke bich me add kardiya ek array me
     //math.max isliye kyuki left kahi kahi 1 de rakha
     for(int i=Math.max(2,left);i<=right;i++){
        if(sieve[i]==true){
            primes.add(i);
        }
     }//now find two closest primes 
     int a=0;int b=Integer.MAX_VALUE;
     for(int j=1;j<primes.size();j++){
        if(primes.get(j)-primes.get(j-1)<(b-a)){
            b=primes.get(j);
            a=primes.get(j-1);
        }
     }//exception case
     if(a==0){
        return new int[]{-1,-1};
     }
    return new int[]{a,b};}
}