class Parameters {
  int x;
  public Parameters(int y){ // Constructor takes a parameter y 
    x = y;
  }
  public static void main(String[] args){
    Parameters p = new Parameters(10); // Parameter is passed to the Constructor
    System.out.println("x is set to : "+ p.x);
  }
}