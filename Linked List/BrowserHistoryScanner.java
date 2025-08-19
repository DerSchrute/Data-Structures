import java.util.*;

public class BrowserHistoryScanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int key = -1;
        history current = null;
        history first = null;

        while (key != 3) {
            System.out.println("1. Add \n 2. View \n 3. Exit");
            key = scanner.nextInt();


            switch (key) {

                case 1:
                System.out.println("Enter URL:");
                String url = scanner.nextLine();
                history fresh = new history(url);

                if (current == null) {
                    current = fresh;
                    first = fresh;
                } else {
                    current.next = fresh;
                    current = fresh;
                }
                break;
                
                case 2:
                history curItem = first;
                System.out.println("Browser History:");
                while (curItem != null) {
                    System.out.println(curItem.getUrl());
                    curItem = curItem.next;
                }
                break;
                
                default:

                break;
            }
        }
    }
}