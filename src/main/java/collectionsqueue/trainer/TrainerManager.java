package collectionsqueue.trainer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TrainerManager {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);

        int i = q.element();
        System.out.println(q);
        System.out.println(i);

        i=q.remove();
        System.out.println(q);

        i=q.remove();
        System.out.println(q);

        System.out.println("Empty: " + q.isEmpty());

        Deque<Integer> d = new LinkedList<>();
        d.push(1);
        d.push(2);
        d.push(3);

        System.out.println("\n" + d);
        System.out.println(d.pop());
        System.out.println(d);
        d.pop();
        System.out.println(d);

    }



}
