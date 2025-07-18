public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;

        if (s.length() > t.length())
            return false;
        int left = 0;
        int start = 0;

        while (start < s.length()) {
            int i = left;
            for (i = left; i < t.length(); i++) {
                if (t.charAt(i) == s.charAt(start))
                    break;
            }
            if (i == t.length())
                return false;
            left = i + 1;
            start++;
        }
        return true;
    }
}
