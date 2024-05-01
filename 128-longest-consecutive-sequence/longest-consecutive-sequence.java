class Solution {
    public int longestConsecutive(int[] nums) {
    int n=nums.length;
    if (n == 0)
            return 0;

    int longest=1;
HashSet<Integer> h=new HashSet<>();
for(int i=0;i<n;i++){
    h.add(nums[i]);
}
for(int e:h){
    if(!h.contains(e-1)){
       int count=1;
   
        while(h.contains(e+1)){
            e++;count++;
        }
    longest = Math.max(longest,count);}
}

    return longest;}
}