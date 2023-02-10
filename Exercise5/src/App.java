public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Person Me = new Person();
        Me.setName("Gianncarlo");
        String myName = Me.getName();
        System.out.println("My name is " + myName + ".");

        Me.setCCNum(129839);
        int myCCNum = Me.getCCNum();
        System.out.println("My credit card number is " + myCCNum + ".");


        Son mee = new Son();
        System.out.println("My surname is " + mee.surname + ".");
        mee.showLove();
    }
}
