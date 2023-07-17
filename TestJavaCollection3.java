import java.util.*;

public class TestJavaCollection3 {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("Arif");
        stack.push("Van de Al");
        stack.push("Elon Mask");
        stack.push("Mark Zuckerberg");
        //        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
