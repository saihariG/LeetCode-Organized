package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> queue = new LinkedList<>();

    public ImplementStackUsingQueues() {

    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while(size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return (queue.size() == 0);
    }
}
