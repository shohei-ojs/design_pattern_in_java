public class Main {
  public static void main(String[] args) {
    System.out.println("Start");
    Singleton obj1 = Singleton.GetInstance();
    Singleton obj2 = Singleton.GetInstance();
    
    if( obj1 == obj2 ) {
      System.out.println("obj1とobj2は同じインスタンスです。");
    }else{
      System.out.println("obj1とobj2は同じインスタンスではありません。");
    }
    System.out.println("End.");
  }
}