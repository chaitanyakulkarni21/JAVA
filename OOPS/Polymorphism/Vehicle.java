class Commute{
  public void Travel(){
    System.out.println("Commuting can be done in any vehicle...");
  }
}

class Car extends Commute{
  public void Travel(){
    System.out.println("You are driving a car...");
  }
}

class Bike extends Commute{
  public void Travel(){
    System.out.println("You are ridding a bike...");
  }
}

class Train extends Commute{
  public void Travel(){
    System.out.println("You are traveling in a train...");
  }
}

class Vehicle{
  public static void main(String[] args){
    Commute howToCommute = new Commute();
    Bike myBike = new Bike();
    Car myCar = new Car();
    Train myTrain = new Train();

    howToCommute.Travel();
    myBike.Travel();
    myCar.Travel();
    myTrain.Travel();
  }
}