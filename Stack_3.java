import java.util.Stack;
public class Stack_3 {

    //Method to push data at the bottom of the Stack.
    static void pushAtBtm(int data, Stack<Integer> stack){

        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBtm(data, stack);
        stack.push(top);
    }

    //Method to reverse complete Stack.
    static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBtm(top, stack);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

       
        stack.push(5);
        stack.push(3);
        stack.push(9);

        
        pushAtBtm(6, stack);
        reverse(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }    
}
