interface Animal {
    void eat();
    void sound();
}
interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Собака ест вкусняшки");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }

    @Override
    public void play() {
        System.out.println("Собака играет с мячом");
    }
}

class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Кошка кушает рыбку");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с мягкой игрушкой");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.play();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        cat.play();
    }
}
