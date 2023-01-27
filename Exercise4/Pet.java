public class Pet {
    String name;
    Person Owner;

    Pet(String petName, Person ownerName) {
        this.name = petName;
        this.Owner = ownerName;
    }
    void showOwnerName() {
        System.out.println("I am a dog. Woof. My name is " + this.name + ". Woof. My owner's name is " + Owner.name + ". Woof.");
    }
    
}