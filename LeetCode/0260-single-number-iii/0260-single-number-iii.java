class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<n;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[2];
        int index=0;
        for(int i=0;i<n;i++){
            if(hp.get(nums[i])==1){
                ans[index++]=nums[i];
            }
        }
        return ans;
    }
}