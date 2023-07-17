import java.util.*;

public class TestJavaCollection2 {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Abc");
        queue.add("Def");
        queue.add("Ghi");
        queue.add("Jkl");
        queue.add("Mno");
        System.out.println("head: " + queue.element());
        System.out.println("head :" + queue.peek());
        System.out.println("Ierating the element");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("After applying remove ");
        queue.remove();
        //        queue.poll();
        Iterator itr1 = queue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("After applying poll ");
        queue.poll();
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
