package idcard;
import framework.*;

public class IDCard extends product {
  private String owner;
  IDCard(String owner) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
  }
  
  public void use() {
    System.out.println(owner + "のカードを作ります。");
  }
  
  public String getOwner() {
    return owner;
  }
}