class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
      int middle=nums[nums.length/2];
      return hp.get(middle)==1;
    }
}