import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt+=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<cnt;i++){
            lst.add(0);
        }
        
        for(int i=0;i<lst.size();i++){
            nums[i] = lst.get(i);
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}