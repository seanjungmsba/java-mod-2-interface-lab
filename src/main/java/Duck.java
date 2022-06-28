public class Duck implements Animal, CanSwim, CanFly {

    public int fly() {
        System.out.println("I'm duck and I can fly up to 35 miles an hour!");
        return 35;
    }

    public void swim() {
        System.out.println("I'm a duck and I can swim down to 30 feet deep");
    }

    public void takeBreath() {
        System.out.println("Duck took a breath.");
    }

    public void makeSound() {
        System.out.println("Duck goes quack, quack.");
    }

}