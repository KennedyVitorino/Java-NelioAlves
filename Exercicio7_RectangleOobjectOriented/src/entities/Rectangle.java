package entities;

public class Rectangle {

  public double width; //  largura
  public double height; //  altura

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return 2 * (width + height);
  }

  public double diagional() {
    return Math.sqrt(width * width + height * height);
  }

}
