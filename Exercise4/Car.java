public class Car {
    String cName;
    Myself cOwner;
    
    Car(String carName, Myself driverName) {
        this.cName = carName;
        this.cOwner = driverName;
    }
    void showDriverName() {
        System.out.println("Vroom. This is a car. I am a " + this.cName + ". I am owned by " + this.cOwner.name + ".");
    }
}
