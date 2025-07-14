class ReverseVowels {
    public String reverseVowels(String s) {

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                str += String.valueOf(s.charAt(i));
            }
        }

        String res = "";
        int j = str.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                res += String.valueOf(str.charAt(j));
                j--;
            } else
                res += String.valueOf(s.charAt(i));
        }
        return res;
    }
}