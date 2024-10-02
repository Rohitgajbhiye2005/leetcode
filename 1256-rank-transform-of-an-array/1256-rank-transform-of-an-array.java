class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int num[]=arr.clone();
      Map<Integer,Integer> res=new HashMap<>();
      Arrays.sort(arr);
      int rank=1;
      for(int n : arr){
        if(!res.containsKey(n))
        res.put(n,rank++);
      }
      for(int i=0;i<arr.length;i++){
        num[i]=res.get(num[i]);
      }
      return num;
    }
}