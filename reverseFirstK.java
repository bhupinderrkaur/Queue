class queue {
    // Function to reverse first k elements of a queue.
  // in- 12345 out -32145
    public void rec(Queue<Integer> q, int k) {
       
        if(k==0){
        return;
        }
            int x=q.peek();
            q.remove();
            rec(q,k-1);
            q.add(x);
       }
        public Queue<Integer> modifyQueue(Queue<Integer> q, int k){
            rec(q,k);
            int size=q.size()-k;
            while(size>0){
                int x=q.peek();
                q.remove();
                q.add(x);
                size--;
            }
            return q;
        }

    
    
