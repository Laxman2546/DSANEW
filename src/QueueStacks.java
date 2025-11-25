import java.util.Stack;

 class MyQueue {
    Stack<Integer> sk1;
    Stack<Integer> sk2;
    public MyQueue() {
        sk1 = new Stack<>();
        sk2 = new Stack<>();
    }

    public void push(int x) {
        sk1.push(x);
    }

    public int pop() {
        while(!sk1.isEmpty()){
            int popped = sk1.pop();
            sk2.push(popped);
        }
        int removed = sk2.pop();
        while (!sk2.empty()){
            sk1.push(sk2.pop());
        }
        return removed;
    }

    public int peek() {
        while(!sk1.isEmpty()){
            int popped = sk1.pop();
            sk2.push(popped);
        }
        int peek = sk2.peek();
        while (!sk2.empty()){
            sk1.push(sk2.pop());
        }
        return peek;

    }
    public boolean empty() {
            return sk1.isEmpty();
    }

}

public class QueueStacks {
    public static void main(String[] args) {
        MyQueue qu = new MyQueue();
        qu.push(1);
        qu.push(2);
        System.out.println(qu.peek());
        System.out.println(qu.pop());
        System.out.println(qu.empty());
    }
}
