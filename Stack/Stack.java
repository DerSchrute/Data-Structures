public class Stack {

    private int top;
    private int maxCapacity;
    private char[] container;

    /**
     * Constructor that doesn't require any argument
     * Default stack size is 10
     */

    public Stack() {
        this.top = 0;
        this.maxCapacity = 10;
        this.container = new char[10];
    }

    /**
     * Constructor that requires an initial size
     * 
     * @param size
     */
    public Stack(int size) {
        this.top = 0;
        this.maxCapacity = size;
        this.container = new char[size];
    }

        
    /**
     * Push new item in our Stack
     */

    public void push(char itemToPush) {
        // when negative index reset to zero
        if (this.top < 0) {
            this.top = 0;
        }
        if (this.top < this.maxCapacity) {
            System.out.println("Pushing " + itemToPush);
            this.container[this.top] = itemToPush;
            this.top++;

        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    public void multiplePush(char item1, char item2){
        this.push(item1);
        this.push(item2);
    }

    public void push(char [] items){
        for (char j : items) {
            this.push(j);
        }
    }
    public char pop() {
        System.out.println("-----------------");
        if (this.top <= 0) {
            System.out.println("Stack Underflow");
            return '_'; // Meaningful value indicating empty stack
        }
        char topItem = this.peek();
        System.out.println(topItem + " was Popped");
        this.top--;
        return topItem;
    }
    

    /**
     * View the top item
     * 
     * @return
     */
    public char peek() {
        System.out.println("-----------------");
        if (this.top == 0) {
            System.out.println("Stack is empty");
            return '_'; // Meaningful value indicating empty stack
        }
        return this.container[this.top - 1];
    }
}
