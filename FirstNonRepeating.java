class Solution{

public String FirstNonRepeating(String A)
   {
       // code here
       HashMap<Character, Integer> m = new HashMap<>();
       Queue<Character> q = new LinkedList<>(); //coz first non repeating
       StringBuilder res = new StringBuilder();
       for(int i = 0; i<A.length(); i++){
           char x = A.charAt(i);
           m.put(x, m.getOrDefault(x,0)+1);
           
           if(m.get(x)==1){
               q.add(x);
           }
           else{
               while(!q.isEmpty() && m.get(q.peek())>1){
                   q.poll();
               }
           }
           
           if(q.isEmpty()) res.append('#');
           else res.append(q.peek());
           
       }
       return res.toString();
   }
    }
