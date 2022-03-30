class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	 //1
	  while(!s1.isEmpty()){
	  s2.push(s1.peek());
	  s1.pop();
	      
	  }
	  //2
       s1.add(x);
	  //3
	  while(!s2.isEmpty()){
	      s1.push(s2.peek());
	  s2.pop();
	  }
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        int ans;
	   if(s1.isEmpty())
	   ans=-1;
	   else
	   {
	       ans=s1.peek();
	       s1.pop();
	   }
	   return ans;
    }
}
