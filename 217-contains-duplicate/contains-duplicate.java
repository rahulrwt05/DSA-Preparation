class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Integer> hash=new HashMap<>();
    for(int num:nums){
        hash.put(num,hash.getOrDefault(num,0)+1);
        if(hash.get(num)>1){
            return true;
        }
    }
  return false;  }
}