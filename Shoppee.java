public class Shoppee {
    public static void main(String[] args) {

        String [] products = new String [7];
        double[] prices = new double[7];

        

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

        }

        System.out.println("Product 1: " + products[0]  + " - Price: $" + prices[0]);
        System.out.println("Product 2: " + products[1]  + " - Price: $" + prices[1]);
        System.out.println("Product 3: " + products[2]  + " - Price: $" + prices[2]);
        System.out.println("Product 4: " + products[3]  + " - Price: $" + prices[3]);
        System.out.println("Product 5: " + products[4]  + " - Price: $" + prices[4]);
        System.out.println("Product 6: " + products[5]  + " - Price: $" + prices[5]);
        System.out.println("Product 7: " + products[6]  + " - Price: $" + prices[6]);

        System.out.println("Total products: " + products.length);

    }