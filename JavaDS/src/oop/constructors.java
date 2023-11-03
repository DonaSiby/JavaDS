class Box {
  double width;
  double height;
  double depth;

  Box() {
    width = 10;
    height = 10;
    depth = 10;
  }

  double volume() {
    return width * height * depth;
  }
}

  

public class constructors {
  public static void main(String[] args) {
    Box box1 = new Box();
    double vol = box1.volume();
    System.out.println("Volume is "+vol);
  }
  
}
