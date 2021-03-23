class TwoWheeler{
  protected String companyName = "Bajaj";
}

class Bike extends TwoWheeler{
  private String modelName = "Discover";
  public static void main(String[] args){
    Bike b = new Bike();
    System.out.println("Bike Brand: " + b.companyName);
    System.out.println("Bike Name: " + b.modelName);
  }
}