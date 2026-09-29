class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int total = 0;
        int current = 0;
        for(int i=0;i<requests.length;i++){
            int next = requests[i]; 
            total +=Math.abs(next-current);
            current = next;
        }
        return total;
    }
}