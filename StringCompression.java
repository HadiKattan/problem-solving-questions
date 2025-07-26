class StringCompression {
    public int compress(char[] chars) {
        String s = "";
        Stack<Character> stack = new Stack<>();
        int count = 1;
        int i = 1;
        for (i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    s = s + String.valueOf(chars[i - 1]) + String.valueOf(count);
                    count = 1;
                } else
                    s = s + String.valueOf(chars[i - 1]);
            }
        }
        if (count > 1) {
            s = s + String.valueOf(chars[i - 1]) + String.valueOf(count);
        } else
            s = s + String.valueOf(chars[i - 1]);
        System.out.println(s);
        for (i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}