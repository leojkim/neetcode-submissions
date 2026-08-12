class Solution {
    public boolean isValid(String s) {
        //We can use a stack here because we are searching for pairings
        Stack<Character> stack = new Stack<>();

        //Iterate through each character in the string
        for (Character c : s.toCharArray()) {

            //If the stack is not empty, we must check if the current character we are at and the previous character make a pair
            if (!stack.isEmpty()) {

                //If we find a pair, we can remove the top element from the stack and continue without doing anything else
                if (isPair(stack.peek(), c)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }

    private boolean isPair(char prev, char curr) {
        return (prev == '(' && curr == ')' ||
            prev == '[' && curr == ']' ||
            prev == '{' && curr == '}');
    } 
}
