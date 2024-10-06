class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int num:stones)
        {
            maxHeap.add(num);
        }
        while(maxHeap.size()>1)
        {
            int y= maxHeap.poll();
            int x= maxHeap.poll();
            if(x!=y)
            {
                maxHeap.add(y-x);
            }
        }
        return (maxHeap.size()>0?maxHeap.poll():0);
    }
}