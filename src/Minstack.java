import java.util.Stack;

class Minstack2{
    Stack<Integer> sk;
    Stack<Integer> minSk;
    public Minstack2() {
        sk = new Stack<>();
        minSk = new Stack<>();
    }

    public void push(int val) {
        if(!minSk.isEmpty()){
        int current = Math.min(minSk.peek(),val);
        minSk.push(current);
        sk.push(val);
        }else{
            sk.push(val);
            minSk.push(val);
        }

    }

    public void pop() {
            sk.pop();
            minSk.pop();
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
