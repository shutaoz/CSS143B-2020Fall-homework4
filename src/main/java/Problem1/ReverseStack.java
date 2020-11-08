package Problem1;

import java.util.Stack;


public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
        reverse(stack);
    }
    public static void insert_at_bottom(int x, Stack<Integer> stack)
    {

        if(stack.isEmpty())
            stack.push(x);

        else
        {

            int a = stack.peek();
            stack.pop();
            insert_at_bottom(x, stack);

            stack.push(a);
        }
    }

    public static void reverse(Stack<Integer> stack)
    {
        if(stack.size() > 0)
        {


            int x = stack.peek();
            stack.pop();
            reverse(stack);

            insert_at_bottom(x, stack);
        }
    }
}