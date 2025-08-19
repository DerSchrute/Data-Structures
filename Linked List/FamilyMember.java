public class FamilyMember {
    
    private String name;
    private int age;
    public FamilyMember next;

    public FamilyMember(String name, int age){
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public FamilyMember getNext() {
        return next;
    }

    public void setNext(FamilyMember next) {
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    }

