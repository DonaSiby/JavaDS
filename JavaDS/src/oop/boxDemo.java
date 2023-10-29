class Box {
  double width;
  double height;
  double depth;
  
  double volume(double height, double width, double depth) {
    double volume = height * width * depth;
    return volume;
  }
}

public class boxDemo {
  public static void main(String[] args) {
    Box box1 = new Box();
    System.out.println(box1.volume(10, 20, 30));
  }
}
