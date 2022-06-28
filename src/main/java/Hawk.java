public class Hawk implements CanFly, Animal {
    
    public int fly() {
        System.out.println("I'm a hawk and I can fly up to 160 miles an hour.");
        return 160;
    }

    public void takeBreath() {
        System.out.println("Hawk has taken a well-needed breath to catch a prey.");
    }

    public void makeSound() {
        System.out.println("Hawk goes kee-eeeee-arr");
    }
}
