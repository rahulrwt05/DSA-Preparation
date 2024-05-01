class Solution {
    public int maxProfit(int[] prices) {
        int minbuyprice=Integer.MAX_VALUE;int maxsellprice=0;
    for(int i=0;i<prices.length;i++){
        minbuyprice=Math.min(minbuyprice,prices[i]);
        maxsellprice=Math.max(maxsellprice,prices[i]-minbuyprice);
    }
  return maxsellprice;  }
}