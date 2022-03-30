class sol{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
           if(q.isEmpty())return null;
       int x=q.peek();
       q.remove();
       rev(q);
       q.add(x);
       return q;
    }
}
