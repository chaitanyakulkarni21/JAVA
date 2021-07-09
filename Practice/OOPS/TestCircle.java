class Circle{
  private double radius;
  private String color;

  public Circle(){
    radius = 1.0;
    color = "red";
  }
  public Circle(double r){
    radius = r;
    color = "red";
  }
  public double getRadius(){
    return radius;
  }
  public double getArea(){
    return radius*radius*Math.PI;
  }
}

public class TestCircle{
  public static void main(String[] args){
    Circle c1 = new Circle();
    System.out.println("The radius of the circle is " + c1.getRadius());
    System.out.println("The Area of the circle is " + c1.getArea());

    Circle c2 = new Circle();
    System.out.println("The radius of the circle is " + c2.getRadius());
    System.out.println("The Area of the circle is " + c2.getArea());

  }
}