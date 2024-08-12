class KthLargest {
int k;
PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>(k);
        for(int i=0;i<nums.length;i++){
            if(pq.size()<k){
                pq.add(nums[i]);
            }else if(nums[i]>pq.peek()){
                pq.add(nums[i]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.add(val);
        }else if(val>pq.peek()){
            pq.add(val);
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */