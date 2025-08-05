public class ShoppeeNew {
    public static void main(String[] args) {

        String[] products = new String[8];
        double[] prices = new double[8];

        products[0] = "Laptop";
        prices[0] = 29_999.99;
        products[1] = "Smartphone";
        prices[1] = 19_999.99;
        products[2] = "Tablet";
        prices[2] = 15_999.99;
        products[3] = "Headphones";
        prices[3] = 5_999.99;
        products[4] = "Smartwatch";
        prices[4] = 1_999.99;
        products[5] = "Minecraft";
        prices[5] = 2_499.99;
        products[6] = "South Korean Escapee (Kim Nam-Il)";
        prices[6] = 0.99;

        int totalProducts = products.length;
        System.out.println("--------Total products------");

        for (int i = 0; i < totalProducts; i++) {
            if(products[i] == null){
                break;
            }
            
            System.out.println("Product " + (i + 1) + ": " + products[i] + " - Price: $" + prices[i]);
        }
        System.out.println("--------End of products------");
    }
}
