// Use of this keyword in return

class Sample{
  Sample getData(){
    return this;
  }
  void message(){
    System.out.println("Wel-Come");
  }
}

class Test{
  public static void main(String[] args){
    new Sample().getData().message();
  }
}