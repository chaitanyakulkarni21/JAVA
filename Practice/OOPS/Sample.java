// Constructor Overloading

class Sample{
  int a;

  Sample(){     // Constructor
    a = 0;
    System.out.println(a);
  }

  Sample(int x) {   // Parameterized contructor
    a = x;
    System.out.println(a);
  }

  public static void main(String[] args){
    Sample s1 = new Sample();
    Sample s2 = new Sample(26);
  }
}