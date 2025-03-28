import java.util.Stack;
public class Stack_3 {

    static void pushAtBtm(int data, Stack<Integer> stack){

        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBtm(data, stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

       
        stack.push(5);
        stack.push(3);
        stack.push(9);

        pushAtBtm(6, stack);
        
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }    
}
