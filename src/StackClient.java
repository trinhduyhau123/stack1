public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(1);
        myStack.push(4);
        myStack.push(1);
        myStack.push(3);

        System.out.println("1. Size of push operation: "+ myStack.size());
        System.out.println("2. Pop elements from stack:");

        while (!myStack.isEmpty()) {
            System.out.printf("%d \t",myStack.pop());
            System.out.println("3. Size of stack after pop: "+ myStack.size());
        }

    }
}
