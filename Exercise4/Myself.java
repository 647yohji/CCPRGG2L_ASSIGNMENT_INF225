public class Myself {
    int age;
    String name;

    Myself(String myName, int myAge) {
        this.age = myAge;
        this.name = myName;
    }
    
    void addFriend(Person Friend) {
        System.out.println("I am friends with " + Friend.name);
    }
}
