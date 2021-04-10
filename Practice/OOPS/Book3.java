// Use of this keyword to pass an argument in constructor

class Sample{
  Book3 obj;
  Sample(Book3 obj){
    this.obj = obj;
  }
  void display(){
    System.out.println(obj.title);
    System.out.println(obj.pages);
  }
}

class Book3{
  String title = "Oracle";
  int pages = 360;
  Book3(){
    Sample s1 = new Sample(this);
    s1.display();
  }
  public static void main(String[] args){
    Book3 obj1 = new Book3();
  }
}