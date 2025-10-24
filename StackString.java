public class StackString {
    private String[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackString(int size) {
        stack = new String[size];
        capacity = size;
        top = -1;
    }

    // Push method
    public void push(String item) {
        if (top == capacity - 1) {
            expand();
        }
        stack[++top] = item;
        System.out.println(item + " pushed into stack");
    }

    // Pop method
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to pop.");
            return null;
        }
        String item = stack[top--];
        System.out.println(item + " popped from stack");
        return item;
    }

    // Peek method
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top];
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == -1;
    }

    // size method
    public int size() {
        return top + 1;
    }

    // display method
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // expand method
    private void expand() {
        int newCapacity = capacity * 2;
        String[] newStack = new String[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
        System.out.println("Stack expanded to size: " + capacity);
    }

    // ============================
    // Main method for testing
    // ============================
    public static void main(String[] args) {
        StringStack
                stack = new StringStack(3);

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date"); // triggers expansion

        // Display
        stack.display();

        // Peek
        System.out.println("Top element is: " + stack.peek());

        // Pop some elements
        stack.pop();
        stack.pop();

        // Display again
        stack.display();

        // Size and empty check
        System.out.println("Current stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}