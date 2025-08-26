public class DriverQueue {
    public static void main(String[] args) {
        Queue stiCashier = new Queue(20);
       
        stiCashier.enqueue('A');
        stiCashier.enqueue('B');
        stiCashier.dequeue();
        stiCashier.enqueue('C');
        stiCashier.enqueue('D');
        stiCashier.enqueue('E');
        stiCashier.enqueue('F');

        
        int dequeueCount = 7; // Set how many times to dequeue

        for (int i = 0; i < dequeueCount; i++) {
            stiCashier.dequeue();
        }

}
}