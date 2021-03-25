//Polymorphism

class Animal {
  public void animalSound(){
    System.out.println("This animal makes a sound...");
  }
}

class Dog extends Animal{
  public void animalSound(){
    System.out.println("The dog barks...");
  }
}

class Cat extends Animal{
  public void animalSound(){
    System.out.println("The cat meows...");
  }
}

class Main{
  public static void main(String[] args){
    Animal myAnimal = new Animal();
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.animalSound();
    myCat.animalSound();
  }
}