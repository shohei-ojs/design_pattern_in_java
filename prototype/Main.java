import framework.*;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    
    UnderlinePen upen = new UnderlinePen('~');
    MessageBox   mbox = new MessageBox('*');
    manager.register("strong message",upen);
    manager.register("warning box",mbox);;
    
    Product p1 = manager.create("strong message");
    Product p2 = manager.create("warning box");
    p1.use("Hello, World.");
    p2.use("Hello, World.");
  }
}