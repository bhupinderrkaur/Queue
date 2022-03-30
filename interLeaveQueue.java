class queue 
{
  

static void interLeaveQueue(Queue<Integer>q)
{
   
    if (q.size() % 2 != 0)
        System.out.println("Input even number of integers." );
  
   
    Stack<Integer> s = new Stack<>();
    int half = q.size() / 2;
  
   
    for (int i = 0; i < half; i++)
    {
        s.push(q.peek());
        q.poll();
    }
  
  
    while (!s.empty()) 
    {
        q.add(s.peek());
        s.pop();
    }
  
    
    for (int i = 0; i < half; i++) 
    {
        q.add(q.peek());
        q.poll();
    }
  
  
    for (int i = 0; i < half; i++)
    {
        s.push(q.peek());
        q.poll();
    }
  
   
    while (!s.empty())
    {
        q.add(s.peek());
        s.pop();
        q.add(q.peek());
        q.poll();
    }
}
