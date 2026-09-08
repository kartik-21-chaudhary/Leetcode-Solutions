class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        int length = s.length();
        int window = p.length();

        if(length<window){
            return list;
        }

        int s1[] = new int[26];
        int p1[] = new int[26];

        for(int i=0;i<window;i++){           //for 1st window
            int si = s.charAt(i) - 'a';
            int pi = p.charAt(i) - 'a';
            s1[si]++;
            p1[pi]++;
        }
        if(Arrays.equals(s1,p1)){
            list.add(0);
            }

        for(int i=1;i<=length-window;i++){  //for remaining window
            int prev = s.charAt(i-1) - 'a';
            int next = s.charAt(i+window-1) - 'a';
            s1[prev]--;
            s1[next]++;
            if(Arrays.equals(s1,p1)){
                list.add(i);
            }
        }
        return list;
    }
}