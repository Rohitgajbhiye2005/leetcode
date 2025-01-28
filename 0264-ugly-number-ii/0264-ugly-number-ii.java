class Solution {
    public int nthUglyNumber(int n) {
       int[] factor = {2,3,5};
       PriorityQueue<Long> q = new PriorityQueue<>();
       HashSet<Long> set = new HashSet<>();
       q.offer(1L);
       set.add(1L);
       long temp=0;
       for(int i=1;i<=n;i++){
        temp = q.poll();
        for(int j:factor){
            if(!set.contains(temp*j))
            q.offer(temp*j);
            set.add(temp*j);
        }
       }
       return (int)temp;
    }
}