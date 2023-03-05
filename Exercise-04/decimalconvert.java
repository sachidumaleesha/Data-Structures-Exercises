import java.util.Scanner;

public class decimalconvert {
  Scanner sc = new Scanner(System.in);
  Stack binaryStack = new Stack(40);
  private int input;

  // get user input
  public void decimalget() {
    System.out.print("Enter Decimal Value:");
    input = sc.nextInt();
  }

  // COnvert to decimal
  public void binaryconvert() {

    while (input > 0) {
      binaryStack.push(input % 2);
      input /= 2;
    }
  }

  public void displayQueue() {
    while (!binaryStack.isEmpty()) {
      System.out.print(binaryStack.pop());
    }
  }
}