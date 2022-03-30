class Solution
{

   int tour(int petrol[], int distance[])
    {	 int start=0;
      int required=0;
      int extra = 0;
        for(int i=0;i<petrol.length;i++){
        extra=extra+petrol[i]-distance[i];
       if(extra<0){
         start=i+1;
         required=required+extra;
         extra=0;
        }
      }
      
      
       if(extra+required>=0) return start;
      return -1;
   }	
}
