import java.util.Stack;

class Minstack2{
    Stack<Integer> sk;
    Stack<Integer> minSk;
    public Minstack2() {
        sk = new Stack<>();
        minSk = new Stack<>();
    }

    public int top() {
        return sk.peek();
    }

    public int getMin() {
        return minSk.isEmpty()?-1:minSk.peek();
    }
}
public class Minstack {
    public static void main(String[] args) {
        Minstack2 mn = new Minstack2();
        mn.push(-2);
        mn.push(0);
        mn.push(-1);
        System.out.println(mn.getMin()+"iam min");
        System.out.println(mn.top()+"iam top");
        mn.pop();
        System.out.println(mn.getMin()+"iam min");
    }
}
