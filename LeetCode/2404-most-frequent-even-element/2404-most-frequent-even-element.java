class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
            }
        }
         int maxV=0;
         int res=-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
            {
            int ans=hp.get(nums[i]);
            if(maxV<ans){
                maxV=ans;
                res=nums[i];
            }
            else if(maxV==ans &&nums[i]<res){
                res=nums[i];
            }
        }
        }
        return res;
    }
}