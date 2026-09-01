class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<n;i++){    
        hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hp.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}