import static java.lang.System.exit;

 class Stack_JavaUC1 {
    class Node{
        int data;
        Node link;

        public Node(int x) {
        }
    }
    Node top;       //global variable reference for top of stack

    // Constructor

    Stack_JavaUC1(){
        this.top = null;  //set null to top for empty stack
    }

    //to add elements in stack
    public void push(int x){
        // create new node temp and allocate memory
        Node temp = new Node(x);

        // check if stack is full insert an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("Stack Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->",temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
    // Utility function to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    private boolean isEmpty() {
        return false;
    }

    // Utility function to pop top element from the stack
    public void pop(int i) // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }


    public static void main(String[] args){
        Stack_JavaUC1 obj = new Stack_JavaUC1();
        obj.push(70);
        obj.push(30);
        obj.push(56);
    // print Stack elements
    obj.display();
        // print Top element of Stack
        System.out.printf("Top element is %d", obj.peek());

        // Delete top element of Stack
        obj.pop(56);
        obj.pop(30);
        obj.pop(70);

        obj.display();

    }

}
