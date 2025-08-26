public class StackDriver {

    public static void main(String[] args) {
        Stack basket = new Stack();
        Stack cabinet = new Stack(20);

        basket.push('J');
        basket.push('A');
        basket.push('S');
        basket.push('M');
        basket.push('I');
        basket.push('N');
        basket.push('E');
       
        int popCount = 7; // Set how many times to pop

        for (int i = 0; i < popCount; i++) {
            basket.pop();
        }

        System.out.println("Top item is: " + basket.peek());
        basket.peek();



    }
}