public class App {
    public static void main(String[] args) throws Exception {
        Person Friend = new Person("Margo", 77);
        Myself Me = new Myself("Gio", 18);

        Me.addFriend(Friend);

        Pet Dog = new Pet("Princess", Friend);
        Dog.showOwnerName();
        

        Car Chikot = new Car("1995 Honda NSX Type R", Me);
        Chikot.showDriverName();
    }
    
    
}
