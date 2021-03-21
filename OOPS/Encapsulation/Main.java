class Person {
  private String name;

  public String getName(){
    return name;
  }
  public void setName(String newName){
    this.name = newName;
  }
}

class Person2{
  private String fname;
  private int age;
  
  public String getNewName(){
    return fname;
  }
  public int getAge(){
    return age;
  }

  public void setNewName(String newfname){
    this.fname = newfname;
  }

  public void setAge(int personAge){
    this.age = personAge;
  }
}

public class Main{
  public static void main(String[] args){
    Person p = new Person();
    p.setName("John");
    System.out.println("The name of the person is : " + p.getName());

    Person2 per = new Person2();
    per.setNewName("Chaitanya Kulkarni");
    per.setAge(26);
    System.out.println("\nName = " + per.getNewName() + "\nAge = " + per.getAge());
  }
}