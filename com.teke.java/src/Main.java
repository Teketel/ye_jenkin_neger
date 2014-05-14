
public class Main {
  public static void main(String[] args) {
    AntTest a = new AntTest();
    System.out.println("Result is: " + a.multi(5, 10));
  }

  public static class AntTest {
     public int multi(int number1, int number2) {
        return number1 * number2;
     }
  }
}
