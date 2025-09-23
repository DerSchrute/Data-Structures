public class TestHashMap {
    
    public static void main(String[] args) {
        
        HashMap test = new HashMap(7);

        test.put("age", "20");
        test.put("grades" , "88");
        test.put("fname", "Anna");
        test.put("lname", "Jesus");

        /**System.out.println("Get Name: " + test.get("fname") + " " + test.get("lname"));
        System.out.println("Get Age: " + test.get("age"));
        System.out.println("Get Grades: " + test.get("grades"));
        System.out.println("Get Spouse: " + test.get("spouse"));
        **/
        test.printAll();
        }
}
