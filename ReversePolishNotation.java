class ReversePolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();
        long res = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int a = s.pop();
                int b = s.pop();
                if (tokens[i].equals("+"))
                    s.push(b + a);
                if (tokens[i].equals("-"))
                    s.push(b - a);
                if (tokens[i].equals("*"))
                    s.push(b * a);
                if (tokens[i].equals("/"))
                    s.push(b / a);
            } else
                s.push(Integer.valueOf(tokens[i]));
        }
        return s.pop();
    }
}