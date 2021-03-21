public class Car{
  public void fullThrottle(){
    System.out.println("The car is going in full speed...");
  }
  public void speed(int maxSpeed){
    System.out.println("The max speed of the car is : " + maxSpeed);
  }

  public static void main(String[] args){
    Car myCar = new Car();
    myCar.fullThrottle();
    myCar.speed(200);
  }
}