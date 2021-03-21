// Constructors can have many parameters

class Cars {
  int model;
  String name;
  public Cars(int year, String carName){
    model = year;
    name = carName;
  }

  public static void main(String[] args){
    Cars cr = new Cars(1998, "Mostang"); // Multiple parameters can be passed to the constructor
    System.out.println("Model: " + cr.model + "\nCar Name : " + cr.name);
  }
}