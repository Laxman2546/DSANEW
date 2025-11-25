import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Stack;

public class CountStudents {
    public  static int  studentCount(int[] students,int[] sandwiches){
        int count = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        Stack<Integer> sk = new Stack<>();
        for(int sandwich: sandwiches ){
            sk.push(sandwich);
        }
        for(int student : students){
            dq.add(student);
        }
        for(int i=0; i<students.length;i++){
            int stackPeek=  sk.peek();
            int queuePeek = dq.peek();
            if(stackPeek == queuePeek){
                sk.pop();
                dq.pollFirst();
            }else{
                dq.offerLast(students[i]);
            }
        }
        count = students.length;
        return count;
    }
     public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};
        int count = studentCount(students , sandwiches);
         System.out.println(count);
    }
}
