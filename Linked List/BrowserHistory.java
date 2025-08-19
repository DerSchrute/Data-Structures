public class BrowserHistory {
    
    public static void main (String [] args){

        
        //node 1
        history his1 = new history();
        his1.setUrl("Instagram.com");
        
        history his2 = new history("Google.com");
        history his4 = new history("Twitter.com");
        history his3 = new history("Facebook.com", his4);

        
        
        // Linking nodes
        his1.next = his2;
        his2.next = his3;

        System.out.println("URL: " + his1.getUrl());

        System.out.println("URL " + his1.next.getUrl());

        System.out.println("URL " + his1.next.next.next.getUrl());

        his1.next.next.next.setUrl("LinkedIn.com");
        System.out.println("URL: " + his1.next.next.next.getUrl());

        System.out.println("====Iteration====");

        
        // Traverse the linked list
        
        history current = his1;
        while (current != null) {
            System.out.println("URL: " + current.getUrl());
            current = current.next;
        }
    }
}
