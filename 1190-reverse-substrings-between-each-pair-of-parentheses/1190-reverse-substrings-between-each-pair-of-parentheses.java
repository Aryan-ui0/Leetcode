class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {

                StringBuilder portion = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '(') {
                    portion.append(stack.pop());
                }

                stack.pop(); // remove '('

                for (int i = 0; i < portion.length(); i++) {
                    stack.push(portion.charAt(i));
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}