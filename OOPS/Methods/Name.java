class Name{
  static void printName(String fname){
    System.out.println("Hello " + fname);
  }

  //Multiple parameters
  static void printAgeAndName(String fname, int age){
    System.out.println("Hello " + fname + " Your age is : " + age);
  }

  static void concatenation(String fname, String lname){
    System.out.println(fname + lname);
  }
  public static void main(String[] args){
    printName("Chaitanya");
    printName("John");
    printName("Tony");
    printName("Devashish");

    printAgeAndName("Chaitanya", 26);
    printAgeAndName("John", 56);
    printAgeAndName("Tony", 34);
    printAgeAndName("Devashish", 25);

    concatenation("Chaitanya","Kulkarni");
  }
}