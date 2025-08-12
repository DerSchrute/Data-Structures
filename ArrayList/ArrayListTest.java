import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList MyFruits = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner scanItem = new Scanner(System.in);  
            int key = -1;

            while (key != 3) {
                System.out.println("Enter 1 to add item");
                System.out.println("Enter 2 to view item");
                System.out.println("Enter 3 to exit");
                key = sc.nextInt();


                switch (key) {
                    case 1:
                        System.out.println("Kindly enter your item");
                        String newItem = scanItem.nextLine();
                        MyFruits.add(newItem);
                        break;
                    
                    case 2:
                        System.out.println("Items in the Array: ");
                        System.out.println(MyFruits.getStringItems());
                        break;
                    
                    case 3:
                    System.out.println("Sayonara");
                    break;

                    default:
                    System.out.println("Invalid input.");
                    break;
                }

                System.out.println("Press any key to continue...");
                sc.nextLine();  

                System.out.println("=====================================");
            }
        }
    }

