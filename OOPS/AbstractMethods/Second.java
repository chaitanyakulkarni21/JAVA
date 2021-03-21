class Second{
  public static void main(String[] args){
    // Create an object of class student which inherits attributes from Main class 
    Student std = new Student();
    System.out.println("Student Name: " + std.fname);
    System.out.println("Student Age: "+ std.age);
    System.out.println("Graduation Year: " + std.graduationYear);
    std.study(); // Abstract method gets called...
  }
}