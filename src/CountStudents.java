import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

public class CountStudents {
    public static int studentCount(int[] students, int[] sandwiches) {
        int count = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> sk = new ArrayDeque<>();
        for (int i=sandwiches.length-1;i>=0;i--) {
            sk.push(sandwiches[i]);
        }
        for (int i=students.length-1; i>=0;i--) {
            dq.add(students[i]);
        }
       while (!dq.isEmpty() && !sk.isEmpty()){
            int stackPeek = sk.peek();
            int queuePeek = dq.peek();
            if (stackPeek == queuePeek) {
                dq.pollFirst();
                sk.poll();
                count = 0;
            } else {
                dq.pollFirst();
                dq.addLast(queuePeek);
                count++;
            }
            if(count == dq.size()){
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        int count = studentCount(students, sandwiches);
        System.out.println(count);
    }
}
