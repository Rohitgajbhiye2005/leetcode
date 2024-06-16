import java.util.Arrays;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;
        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);

                 i++;
                 j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
           
        }
        int []res=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            res[k]=arr.get(k);
        }
        return res;
    }
}