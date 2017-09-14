import factory.*;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Error");
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);
    
    Link asahi    = factory.createLink("朝日新聞", "htto://www.asahi.com/")
    Link yomiuri  = factory.createLink("読売新聞", "htto://www.yomiuri.co.jp/")
  }
}