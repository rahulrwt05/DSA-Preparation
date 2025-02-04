class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> roy=new HashMap<>();
     for(int i=0;i<nums.length;i++){
       int diff=target-nums[i];
        if(roy.containsKey(diff)){
            return new int[]{
                roy.get(diff),i
            };
        }
   roy.put(nums[i],i);
     }
 return null;
 }}