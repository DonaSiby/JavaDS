class Box {
  double width;
  double height;
  double depth;
  
  double volume(double height, double width, double depth) {
    return width*height*depth;
  }
}
public class boxDemo {
  public static void main(String[] args) {
    Box box1 = new Box();
    System.out.println("Vol is :"+box1.volume(10, 20, 30));
  }
}
