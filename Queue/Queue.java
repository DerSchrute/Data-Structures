public class Queue{
    private char [] queue;
    private int capacity;
    private int vacant;

    public Queue(){
        this.queue = new char[10];
        this.capacity = 10;
        this.vacant = 0;
    }
    public Queue(int capacity){
        this.queue = new char[capacity];
        this.capacity = capacity;
        this.vacant = 0;
    }
    public void enqueue(char item){
        System.out.println("Enqueuing: " + item);
        this.queue[this.vacant] = item;
        this.vacant++;
    }
    public char dequeue(){
        char servingItem = this.queue[0];
        System.out.println("Serving: " + servingItem);
        this.moveForward();
        return servingItem;
    }
    public void moveForward(){
        String msg = "Queue: [ ";
        for(int i = 0; i < this.vacant - 1; i++){
            msg += i + ": " + this.queue[i] + ", ";
            this.queue[i] = this.queue[i + 1];
        }
        msg += "]";
        this.vacant--;
        System.out.println(msg);
    }
}