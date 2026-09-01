class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(hm.containsKey(target))
        return true;
        return false;
    }
}