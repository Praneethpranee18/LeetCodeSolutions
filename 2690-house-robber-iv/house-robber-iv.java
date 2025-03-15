class Solution {
    public boolean canRob(int[] nums,int mid,int k){
        int cnt = 0,n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] <= mid){
                cnt++;
                i++;
            }
        }
        return cnt >= k;
    }
    public int minCapability(int[] nums, int k) {
        int left = 1,right = Arrays.stream(nums).max().getAsInt(), ans = right;
        while(left <= right){
            int mid = (left + right) / 2;
            if(canRob(nums, mid, k)){
                ans = mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}