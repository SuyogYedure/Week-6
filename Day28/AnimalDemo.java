interface Animal{
  public void speak();
  public void eat();
}
class Dog implements Animal{
  public void speak(){
    System.out.println("It is a Dog");
    System.out.println("Bhowwww Bhowwww");
  }
  public void eat(){
    System.out.println("It is a Dog");
    System.out.println("It eats pedigree");
  }
}
class Cat implements Animal{
  public void speak(){
    System.out.println("It is a Cat");
    System.out.println("Meaowww Meaowww");
  }
  public void eat(){
    System.out.println("It is a Cat");
    System.out.println("It drinks milk");
  }
}
class Cow implements Animal{
  public void speak(){
    System.out.println("It is a Cow");
    System.out.println("Baaa Baaa");
  }
  public void eat(){
    System.out.println("It is a Cow");
    System.out.println("It eats grass");
  }
}
class AnimalDemo{
  public static void main(String args[]){
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal cow = new Cow();
    dog.speak();
    dog.eat();
    cat.speak();
    cat.eat();
    cow.speak();
    cow.eat();
  }
}