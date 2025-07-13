class Solution {
    public String reverseWords(String string) {
        Stack<Character> s = new Stack<>();
        String str = string.trim();
        for (int i = 0; i < str.length(); i++) {
            if (!s.isEmpty() && s.peek() == ' ' && str.charAt(i) == ' ')
                continue;
            s.push(str.charAt(i));
        }

        String res = "";
        String result = "";

        while (!s.isEmpty()) {
            char c = s.pop();
            if (c == ' ') {
                result = result + res + " ";
                res = "";
            } else
                res = String.valueOf(c) + res;
        }
        result = result + res;
        return result;
    }
}