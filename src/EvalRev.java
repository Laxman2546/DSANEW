import java.util.Arrays;
import java.util.Stack;

public class EvalRev {
    public static  int checkEval(String[] tokens){
        Stack sk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
          try{
              int num  = Integer.parseInt(tokens[i]);
              sk.push(num);
          }catch (NumberFormatException e){
              int first = (int) sk.pop();
              int second = (int) sk.pop();
              String operator = tokens[i];
              int output ;
              switch (operator){
                  case "+":
                      output  = first + second;
                      sk.push(output);
                      break;
                  case "-":
                      output = second - first;
                      sk.push(output);
                      break;
                  case "*":
                      output = first * second;
                      sk.push(output);
                      break;
                  case "/":
                      output = second / first;
                      sk.push(output);
                      break;
              }
          }

        }

        return (int)sk.peek();

    }
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
       int resultData = checkEval(tokens);
        System.out.println(resultData);
    }
}
