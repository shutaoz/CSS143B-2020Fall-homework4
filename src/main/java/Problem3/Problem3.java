package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        printHelp(helper(null, list), print);
    }

    public static ListNode helper(ListNode reversed, ListNode remaining) {
        if(remaining==null) return reversed;
        ListNode tmp = remaining.next;
        remaining.next = reversed;

        return helper(remaining, tmp);

    }

    public static void printHelp(ListNode reversed, PrintStream print){
        ListNode temp = reversed;
        while(temp != null){
            print.print(temp.val);
            temp = temp.next;
        }


    }
}
