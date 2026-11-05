class Solution {
    public long findTheArrayConcVal(int[] nums) {
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i:nums){
            l1.add(i);
        }
       long sum=0;  
      
       while(l1.size()>1){
       int first = l1.get(0);
       int last = l1.get(l1.size()-1);

       String digit = String.valueOf(first) + String.valueOf(last);

       sum += Long.parseLong(digit);

        l1.remove(0);
        l1.remove(l1.size()-1);

       
       }
        if(l1.size()==1){
            sum += l1.get(0);
        }
    
       return sum;
       

        
    }
}