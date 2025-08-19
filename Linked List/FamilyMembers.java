public class FamilyMembers {
    
    public static void main(String[] args) {
        
        FamilyMember member1 = new FamilyMember("Dennis", 19);
        FamilyMember member2 = new FamilyMember("Cassandra", 14);
        FamilyMember member3 = new FamilyMember("Mikhael", 10);
        FamilyMember member4 = new FamilyMember("ELijah", 7);

        member1.next = member2;
        member2.next = member3;
        member3.next = member4;
    
        System.out.println("First Borne: " + member1.getName() + ", Age: " + member1.getAge());
        System.out.println("Second Borne: " + member1.getNext().getName() + ", Age: " + member1.getNext().getAge());
        System.out.println("Third Borne: " + member1.getNext().getNext().getName() + ", Age: " + member1.getNext().getNext().getAge());
        System.out.println("Fourth Borne: " + member1.getNext().getNext().getNext().getName() + ", Age: " + member1.getNext().getNext().getNext().getAge());
        
        System.out.println("====Family Members====");
        FamilyMember current = member1;
        
        while (current != null) {
            System.out.println("Name: " + current.getName() + ", Age: " + current.getAge());
            current = current.getNext();
        }
}
}
