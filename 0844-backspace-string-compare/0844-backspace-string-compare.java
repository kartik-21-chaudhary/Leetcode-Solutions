class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> sec = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                first.push(ch);
            } else if (!first.isEmpty()) {
                first.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                sec.push(ch);
            } else if (!sec.isEmpty()) {
                sec.pop();
            }
        }
        return first.equals(sec);
    }
}