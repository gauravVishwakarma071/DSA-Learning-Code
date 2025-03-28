import java.util.ArrayList;
class Stack{
    ArrayList<Integer> list = new ArrayList<>();

    //check for underFlow or Overflow situation.
    boolean isStackEmpty(){
        return list.isEmpty();
    }

    void push(int data){
        list.add(data);
    }

    int pop(){
        if(list.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        list.remove(list.size()-1);
        int top = list.get(list.size()-1);
        return top;
    }

    int peek(){
        return list.get(list.size()-1);
    }
}

public class StackArrayList{
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(5);
        stack.push(3);
        stack.push(9);
        while(!stack.isStackEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        
    }
}